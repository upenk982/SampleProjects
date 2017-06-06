package com.example.polymorphism;

//Inheritance with base class with super constructor
public class ExampleInterfaceImpel2 extends BaseClass implements ExampleInterface{
	//Constructing the class using the base class contractor 
	public ExampleInterfaceImpel2(String something1, String something2) {
		super(something1, something2);
		// TODO Auto-generated constructor stub
	}
	//method impel of the abstract method signature in the interface
	public void writeline() {
		System.out.println("Coming Interface 2");
		commonWriteLine();
	}

}
