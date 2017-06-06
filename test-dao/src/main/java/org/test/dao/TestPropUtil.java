package org.test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestPropUtil {
	
	public static final String JDBC_DRIVER = "jdbc.driver";
	public static final String JDBC_URL = "jdbc.url";
    public static final String JDBC_USERNAME = "jdbc.user";
    public static final String JDBC_PASSWORD = "jdbc.password";
	
	private static Properties properties;
	
	public static void loadJDBCProperties() throws IOException{
		InputStream input = TestPropUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		properties = new Properties();
		properties.load(input);
	}
	
	public static String getProperty(String key){
		return properties.get(key).toString();
	}
	
}
