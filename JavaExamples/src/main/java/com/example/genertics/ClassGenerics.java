package com.example.genertics;

//Class Generics for java classes
//Tip- use element E
public class ClassGenerics<E> {

		  private E t;

		  public void add( E t) {
		    this.t = t;
		  }

		  public E get() {
		    return t;
		  }

		  public static void main(String[] args) {
			 ClassGenerics<Integer> integerBox = new ClassGenerics<Integer>();
			 ClassGenerics<String> stringBox = new ClassGenerics<String>();
		    
		     integerBox.add(new Integer(10));
		     stringBox.add(new String("Hello World"));

		     System.out.printf("Integer Value :%d\n\n", integerBox.get());
		     System.out.printf("String Value :%s\n", stringBox.get());
		  }
}
