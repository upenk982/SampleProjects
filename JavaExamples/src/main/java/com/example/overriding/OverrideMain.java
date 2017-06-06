package com.example.overriding;

public class OverrideMain {
	
	public static void main(String[] args){
		BasePast basePast = new BaseFuture();
		basePast.whatsHappened();
	}

}
