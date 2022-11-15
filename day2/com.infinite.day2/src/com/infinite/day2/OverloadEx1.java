package com.infinite.day2;

public class OverloadEx1 {
	
	public void show(int x){
		System.out.println("show method w.r.t Integer" +x);
		
	}
	public void show(double x){
		System.out.println("show method w.r.t double" +x);
	}
	public void show(String x){
		System.out.println("show method w.r.t string" +x);
	}
	public static void main(String[] args) {
		OverloadEx1 obj= new OverloadEx1();
		obj.show(12);
		obj.show(12.5);
		obj.show("welcome");
	}
	

}
