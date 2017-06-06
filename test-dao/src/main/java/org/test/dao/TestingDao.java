package org.test.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestingDao extends Dao<Testing>{
	
	private static final String INSERT_SQL = "insert into testing (nameId,LastName,FirstName) values (?,?,?)";
	
	@Override
	protected String setInsertquery() {
		return INSERT_SQL;
	}

	@Override
	protected void setinsertFields(PreparedStatement preparedStatement,Testing t) throws SQLException{
		int i = 1;
		preparedStatement.setLong(i++, t.getNameId());
		preparedStatement.setString(i++, t.getLastName());
		preparedStatement.setString(i++, t.getFirstName());
		
	}

}
