package com.mypractice.logic;

public class NumberPalindrome {

	/* This function returns true if the given number is a palindrome */
    public static boolean isPalindrome(int number){
        
        int original = number, temp=0;
        //palindrome logic
        while(number > 0){
            int last = number % 10;            
            temp = temp * 10 + last;
            number = number / 10;
        }        
        return original==temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is Palindrome = "+NumberPalindrome.isPalindrome(151));        
	}

}
