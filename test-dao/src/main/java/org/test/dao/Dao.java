package org.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Dao<T> {
	
	protected abstract String setInsertquery();
	protected abstract void setinsertFields(PreparedStatement preparedStatement, T t) throws SQLException;
	
	public void create(Connection connection, T t){
		
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(setInsertquery());
			setinsertFields(preparedStatement,t);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
