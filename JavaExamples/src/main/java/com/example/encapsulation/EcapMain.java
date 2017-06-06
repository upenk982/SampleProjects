package com.example.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EcapMain {

	public static void main(String[] args){
	 ExampleEncapsulation encapsulation = new ExampleEncapsulation();
	 encapsulation.setFirstName("Upen");
	 encapsulation.setLastName("Kumar");
	 encapsulation.setAge(29);
	 encapsulation.setBirthday("10-22-1986");
	 List<String> hobbies = new ArrayList();
	 hobbies.add("Basketball");
	 hobbies.add("football");
	 hobbies.add("baseball");
	 hobbies.add("cricket");
	 hobbies.add("soccer");
	 hobbies.add("Web surfing");
	 hobbies.add("Anything work related for IT, have to get paid to live life");
	 hobbies.add("Movies");
	 hobbies.add("music-anything that is pleasure for my ear, different people have different taste");
	 hobbies.add("Keeping fit as much as I can, balance between cardio and weights now, I was the mostly bulky in my sophmere year in college");
	 encapsulation.setHobbies(hobbies);
	 
	 for(String hobby : hobbies){
		 System.out.println(hobby);
	 }
	}
}
