package com.example.multithreading;

//class to call the  java main method for instantiating a the runnable  class and setting the thread name
public class ThreadMain {
	
	   public static void main(String args[]) {
	   
	      RunnableDemo R1 = new RunnableDemo( "Thread-1");
	      R1.start();
	      
	      RunnableDemo R2 = new RunnableDemo( "Thread-2");
	      R2.start();
	   }   
	}
