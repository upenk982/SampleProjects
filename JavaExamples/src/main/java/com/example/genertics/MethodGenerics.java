package com.example.genertics;

//Method Generics for java methods
//Tip- use element E
//Tip - using object is smiler to using E
public class MethodGenerics {
	   // generic method printArray   
	   //protect against type cast exception
	   //no need of casting (the compiler hides this from you)
	   public static < E > void printArray( E[] inputArray )
	   {
	      // Display array elements              
	         for ( E element : inputArray ){        
	            System.out.printf( "%s ", element );
	         }
	         System.out.println();
	    }
	   
	   // Object method printArray     
	   public static void printObjectArray(Object[] inputArray){
		   	// Display array elements              
	         for ( Object element : inputArray ){        
	            System.out.printf( "%s ", element );
	         }
	         System.out.println();
	   }

	    public static void main( String args[] )
	    {
	        // Create arrays of Integer, Double and Character
	        Integer[] intArray = { 1, 2, 3, 4, 5 };
	        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	        System.out.println( "Array integerArray contains:" );
	        printObjectArray( intArray  ); // pass an Integer array

	        System.out.println( "\nArray doubleArray contains:" );
	        printObjectArray( doubleArray ); // pass a Double array

	        System.out.println( "\nArray characterArray contains:" );
	        printObjectArray( charArray ); // pass a Character array
	    } 
}
