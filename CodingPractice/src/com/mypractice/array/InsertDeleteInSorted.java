package com.mypractice.array;

public class InsertDeleteInSorted {
	/* This method adds an element in a sorted array */
	public static void insertElement(int[] arr, int len, int element) {
		int cap = arr.length;
		if(len >= cap)
			return;
		int i;
		/*traverse array from last to the element which is equal to or greater
		 than the element to be inserted. */ 
		for(i=len-1;(arr[i]>element && i>=0);i--)
			arr[i+1] = arr[i];	
		//insert the element at the appropriate position;
		arr[i+1] = element;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        
		InsertDeleteInSorted.insertElement(arr, 4, 1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
