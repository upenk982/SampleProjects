package org.test.dao;


public class DaoFactory {

	public static Object createDao(Class className){
		Object object = null;
		try{
			Class<?> clazz = Class.forName(className.getName());
			object = clazz.newInstance();
		}catch(Exception e){
			
		}
		return object;
	}
}
