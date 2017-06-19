package com.mypractice.logic;

public class FibonacciSeries {

	/* This function prints the fibonacci series of a given length */
	public static void printFobonacciSeries(int length){
        int start = 1;
        int prev = 1,next= start+prev;;
        System.out.print(start+" "+prev+" ");
        for(int k=0; k<length-2; k++){                       
            System.out.print(next+" ");
            start = prev;
            prev = next;
            next = start +prev;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries.printFobonacciSeries(10);
	}

}
