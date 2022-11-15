package com.infinite.day1;

public class Marks {
	
	public void check(int m,int p,int c,int s,int t){
		float total,avg;
		total=m+p+c+s+t;
		avg=(float)(total/5.0);
		System.out.println("total " +total);
		System.out.println("avg " +avg);
  }
	public void show(int m,int p,int c,int s,int t){
		if(m>=35 && p>=35 && c>=35 && s>=35 && t>=35 ){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}
	public static void main(String[] args) {
	   int m,p,c,s,t;
		m=50;
		p=57;
		c=66;
		s=87;
		t=45;
		Marks obj= new Marks();
		obj.check(m,p,c,s,t);
		obj.show(m, p, c, s, t);
		
		
		
	}

}
