package com.example.innerclass;

/*
 * Outter class
 */
class ExampleInnerClass {
		   int num;
		   //Inner class
		   private class Inner_Demo{
		      public void print(){	   
		      System.out.println("This is an inner class");
		      }
		   }
		   //Accessing he inner class from the method within
		   void display_Inner(){
		      Inner_Demo inner = new Inner_Demo();
		      inner.print();
		   }
		   public static void main(String args[]){
		      //Instantiating the outer class 
			  ExampleInnerClass outer = new ExampleInnerClass();
			  outer.display_Inner();
		      //Accessing the display_Inner() method.
		   }
}
