package org.examples;

public class Example {
	
	public void voteex() {
		
		int a = 30;
		if(a>=18) {
			System.out.println(" Eligible to vote");
			
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
		}
	public static void main(String[] args) {
		
		Example s = new Example();
		s.voteex();
		
	}

	
	
	
	
}
