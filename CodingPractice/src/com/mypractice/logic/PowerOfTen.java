package com.mypractice.logic;

public class PowerOfTen {

	/* This function returns true if the given number is of power 10
	 * i.e if x=50 it should return false,
	 *     if x=100 it should return true*/
	public static boolean isPowerTen(int x){
		/*int length = String.valueOf(x).length();
		int powerTen = (int) Math.pow(10.0, length-1);*/
		int pow = 1;
		while(pow < x)
			pow = 10 * pow;
		
		return pow==x;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is power Ten = "+ PowerOfTen.isPowerTen(50));
	}

}
