package com.example.hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//creating. populating, and querying hashmap
//Tip-SIE-Set,Iterator, and Entry
public class HashMapExample {
	
	private static HashMap<String, String> hm;
	
	public static void populate(){
		hm = new HashMap<String,String>();
		hm.put("Upen1", "value-everything");
	}
	
	public static void unpopulate(HashMap<String, String> hm)
	{
		Set entrySet = hm.entrySet();
		Iterator it = entrySet.iterator();
		
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			System.out.println("Key is " + entry.getKey() + "Value is " + entry.getValue());
		}
	}
	public static void unpopulate1(HashMap<String, String> hm){
		for(Entry e : hm.entrySet()){
			System.out.print(e.getKey() + "  " + e.getValue());
		}
	}
	public static void main(String[] args){
		populate();
		unpopulate1(hm);
	}
}
