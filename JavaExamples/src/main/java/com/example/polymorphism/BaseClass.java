package com.example.polymorphism;

public class BaseClass {
	private String  something1;
	private String something2;

	
	public BaseClass(String something1, String something2){
		this.something1 = something1;
		this.something2 = something2;
	}
	protected void commonWriteLine(){
		System.out.println("Doing "+something1 + " and "+ something2 +" together!");
	}
}
