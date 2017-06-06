package com.example.abstraction;

public class AbstractMainClass {
	
	public  static void main(String args[]){
		AbstractBaseClass class1 = new ChildClass1();
		AbstractBaseClass class2 = new ChildClass2();
		//calls the first child1 class callAnothermethod method in the base abstract class 
		class1.callAnothermethod();
		//calls the first child2 class callAnothermethod method in the base abstract class
		class2.callAnothermethod();
	}

}
