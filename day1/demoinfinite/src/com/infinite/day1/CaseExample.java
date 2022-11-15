package com.infinite.day1;

public class CaseExample {
	 
	public void show(int n){
		switch(n) {
		case 1:
			System.out.println("hi this is bhargavi");
			break;
		case 2:
			System.out.println("hi this is chandu");
			break;
		case 3:
			System.out.println("hi this is anu");
			break;
		case 4:
			System.out.println("hi this is hussenaiah");
			break;
		default:
			System.out.println("invalid choice");
		}
	}
	public static void main(String[] args) {
		int n=5;
		CaseExample obj=new CaseExample();
		obj.show(n);
		
	}

}
