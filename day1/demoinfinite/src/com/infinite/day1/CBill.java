package com.infinite.day1;

public class CBill {
	
	public void show(int units){
		double bill,rate;
		bill=0;
		if(units <= 90) {
			rate=1;
			bill = units * rate;
		}
		if (units > 90){
			rate=1;
			bill = 90 * rate;
			if(units-150>0){
				rate=1.5;
				bill=bill+(60*rate);
			}else {
				rate=1.5;
				bill=bill+((units-90)*rate);
			}
		}
		if(units>150){
			if(units-200>0){
				rate=2;
				bill+=(rate*50);	
			}else{
				rate=2;
				bill+=(units-150)*rate;
			}
			
		}
		if(units>200){
			if(units-240>0){
				rate=2.5;
				bill+=(rate*40);
			}else{
				rate=2.5;
				bill+=(units-200)*rate;
			}
		}
		System.out.println("bill " +bill);
	}
	public static void main(String[] args) {
		int units=92;
		CBill obj=new CBill();
		obj.show(units);
		
		
	}

}
