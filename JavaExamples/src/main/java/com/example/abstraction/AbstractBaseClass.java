package com.example.abstraction;

//abstract class that can't be instantiated  
public abstract class AbstractBaseClass {

	//public method to call the method being implemented
	public void callAnothermethod(){
		writeLine();
	}
	//method signature only
	protected abstract void writeLine();
}
