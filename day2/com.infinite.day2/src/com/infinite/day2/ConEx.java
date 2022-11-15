package com.infinite.day2;

public class ConEx {
	
	static{
		System.out.println("static constructor ");
	}
	ConEx(){
		System.out.println("Instance constructor ");
	}
	public static void main(String[] args) {
		new ConEx();
	}

}
