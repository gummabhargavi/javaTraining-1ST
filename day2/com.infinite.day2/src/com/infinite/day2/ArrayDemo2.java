package com.infinite.day2;

public class ArrayDemo2 {
	
	public void  show(){
		String[] names= new String[]{
				"Sachin","Bhargavi","vinaa","vassu","Sowmya"
		};
		for (String s: names) {
			System.out.println(s);
			
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo2 obj=new ArrayDemo2();
		obj.show();
		
		
	}

}
