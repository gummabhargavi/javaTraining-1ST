package com.infinite.day2;

enum WeekDay{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumEx1 {
	
	public static void main(String[] args) {
		WeekDay wd=WeekDay.THURSDAY;
		System.out.println(wd);
		String str="FRIDAY";
		wd=WeekDay.valueOf(str);
		System.out.println(wd);
		
	}

}
