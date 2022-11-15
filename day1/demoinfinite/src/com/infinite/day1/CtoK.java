package com.infinite.day1;

public class CtoK {
	
	public void calc(double c){
		double k=((9*c)/5)+270;
		System.out.println("Kelvine value" +k);
	}
	public static void main(String[] args) {
		double c= 37;
		CtoK obj= new CtoK();
		obj.calc(c);
	}

}
