package test.org;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.test.dao.DaoFactory;
import org.test.dao.RTUpdate;
import org.test.dao.TestPropUtil;
import org.test.dao.Testing;
import org.test.dao.TestingDao;
import org.test.dao.Update;

@Path("/test")
public class TestService {
	
	@Path("/postTest")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response testPost(Testing testing){
		Response response = Response.status(Status.INTERNAL_SERVER_ERROR).build();
		try{
			TestPropUtil.loadJDBCProperties();
			DriverManager.registerDriver((Driver) Class.forName(TestPropUtil.getProperty(TestPropUtil.JDBC_DRIVER)).newInstance());
			Connection connection = DriverManager.getConnection(TestPropUtil.getProperty(TestPropUtil.JDBC_URL),TestPropUtil.getProperty(TestPropUtil.JDBC_USERNAME),TestPropUtil.getProperty(TestPropUtil.JDBC_PASSWORD)); 
			TestingDao testingDao = (TestingDao)DaoFactory.createDao(TestingDao.class);
			testingDao.create(connection, testing);
			response = Response.ok(new RTUpdate(Update.SUCESSS)).build();
		}catch(Exception e){
			
		}
		return response;	
	}

}
