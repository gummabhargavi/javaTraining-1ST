package com.infinite.day1;

public class Voting {
	
	public void check(int age){
	   if(age>=18){
		   System.out.println("you are Eligible for Voting");
	   }
	   else{
		   System.out.println("you are not eligible for Voting");
	   }
	}
	public static void main(String[] args) {
		int age=17;
		Voting obj = new Voting();
			obj.check(age);
	}

}
