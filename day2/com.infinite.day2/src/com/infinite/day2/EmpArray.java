package com.infinite.day2;

public class EmpArray {
	
	public static void main(String[] args) {
		Emp[] arr=new Emp[]{
				new Emp(1,"sai kumar",84328),
				new Emp(2,"kishore",84329),
				new Emp(3,"bhargavi",84330),
				
		};
		for (Emp emp : arr) {
			System.out.println(emp);
			
		}
	}

}
