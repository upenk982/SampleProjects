package com.example.polymorphism;

public class PolymorphismMainClass {
	
	public static void main(String arg[]){
		ExampleInterface exampleInterface1 = new ExampleInterfaceImpel1("Upen","Something1");
		ExampleInterface exampleInterface2 = new ExampleInterfaceImpel2("Upen", "Something2");
		exampleInterface1.writeline();
		exampleInterface2.writeline();
		BaseClass baseClass1 =  new ExampleInterfaceImpel1("Upen","Doing something1 & something2 together");
		BaseClass baseClass2 =  new ExampleInterfaceImpel1("Upen","End doing something together forever when and if she says yes");
		BaseClass baseClass3 =  new ExampleInterfaceImpel1("Upen",":)");
		baseClass1.commonWriteLine();
		baseClass2.commonWriteLine();
		baseClass3.commonWriteLine();
	}

}
