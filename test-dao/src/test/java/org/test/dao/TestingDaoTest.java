package org.test.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.test.dao.TestPropUtil;
import org.test.dao.TestingDao;
import org.test.dao.Testing;
import org.test.dao.DaoFactory;
import org.junit.Test;

public class TestingDaoTest {

	@Test
	public void testCreate() throws SQLException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		TestPropUtil.loadJDBCProperties();
		DriverManager.registerDriver((Driver) Class.forName(TestPropUtil.getProperty(TestPropUtil.JDBC_DRIVER)).newInstance());
		Connection connection = DriverManager.getConnection(TestPropUtil.getProperty(TestPropUtil.JDBC_URL),TestPropUtil.getProperty(TestPropUtil.JDBC_USERNAME),TestPropUtil.getProperty(TestPropUtil.JDBC_PASSWORD)); 
		TestingDao testingDao = (TestingDao)DaoFactory.createDao(TestingDao.class);
		Testing testing = new Testing();
		testing.setNameId(new Long(1));
		testing.setFirstName("Upen");
		testing.setLastName("Kumar");
		testingDao.create(connection, testing);
	}

}
