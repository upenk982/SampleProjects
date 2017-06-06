package org.test.dao;

import java.io.Serializable;

public class RTUpdate implements Serializable{
	
	private Update update;
	public Update getUpdate() {
		return update;
	}
	public void setUpdate(Update update) {
		this.update = update;
	}
	public RTUpdate(Update update){
		this.update = update;
	}
}
