package com.mypractice.algo;

import java.util.Arrays;

public class Sort {

	/* This method sorts a given array using bubble sort algorithm*/
	 public static void bubbleSort(int[] array){
	        int arrayLength = array.length;        
	        for(int i=0; i<arrayLength; i++){
	            for(int j=1; j<arrayLength-i; j++){
	                System.out.println("Comparing "+array[j-1]+" with "+array[j]);
	                if(array[j-1] > array[j]){
	                    //swapping
	                    int temp = array[j-1];
	                    array[j-1] = array[j];
	                    array[j] = temp;
	                }
	            }
	          System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(array));


	        }	        
	    }
	 
		public static void sort(int[] array){//1,5,5,2,2,7
//			int 
			int n=array.length;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(array[i] > array[j] ){
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
//			int temp=0;
//			for(int i=0;)
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = {2,3,9,6,8,10,13,5,7};
        Sort.sort(array);
        //System.out.println();
        int n=array.length;
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
	}

}
