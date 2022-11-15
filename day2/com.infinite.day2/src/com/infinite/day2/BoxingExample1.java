package com.infinite.day2;

public class BoxingExample1 {
	
	public static void main(String[] args) {
		int a=12;
		String str="hello";
		double sal=52343.32;
		
		//implementing boxing
		
		BoxingExample1 obj=new BoxingExample1();
		Object obj1=a;
		Object obj2=str;
		Object obj3=sal;
		
		//unboxing
		
		int a1=(Integer)obj1;
		String s1=(String)obj2;
		double b1=(Double)obj3;
		
		System.out.println(a1);
		System.out.println(s1);
		System.out.println(b1);
	}

}
