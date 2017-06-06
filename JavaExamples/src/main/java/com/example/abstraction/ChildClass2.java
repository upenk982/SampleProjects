package com.example.abstraction;
//child1 class extending to parent abstract class
public class ChildClass2 extends AbstractBaseClass{
	//method implementation of the abstract method in the parent abstract class
	//access modifier is protected so it can be only used in the same package
	protected void writeLine() {
		System.out.println("Coming to ChildClass2");
	}

}
