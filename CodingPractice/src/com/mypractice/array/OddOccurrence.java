package com.mypractice.array;

public class OddOccurrence {

	/* This function finds the odd times occurring element in an array 
	 * we use bitwise XOR technique here. We get 0 if both the elements are same and the element 
	 * itself if we do XOR with 0. */
	public static int getOddOccurrence(int[] arr){
		int xor = 0;
		for(int i=0; i<arr.length; i++){
			xor ^= arr[i];
		}
		return xor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,1,2,4,5,6,7,4,2,5,7,6,4};
		System.out.println("Odd Occurring Element: "+OddOccurrence.getOddOccurrence(array));
	}

}
