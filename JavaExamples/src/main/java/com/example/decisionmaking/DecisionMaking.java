package com.example.decisionmaking;

public class DecisionMaking {
	
	private static void decisions(String decision){
		String together = "MAKE_IT_TOGETHER";
		if(decision.equalsIgnoreCase(together)){
			System.out.println("It always good");
		}
	}
	
	public static void main(String[] args){
		decisions("MAKE_IT_TOGETHER");
		System.out.println("All of the mercy in the universe");
	}

}
