package com.infinite.day1;

public class CurrentBill {
		
		public void calc(double c){
		double r=(4*c/5);
		System.out.println("radius value" +r);
		
	}
	
	public static void main(String[] args) {
		double c=37;
		CurrentBill obj = new CurrentBill();
		obj.calc(c);
		
		
	}

}
