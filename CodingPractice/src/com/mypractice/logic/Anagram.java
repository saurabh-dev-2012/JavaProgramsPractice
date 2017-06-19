package com.mypractice.logic;

import java.util.Arrays;

public class Anagram {

	/*This function checks if the two input strings are anagram of each other */
	 public static boolean isAnagram(String s1, String s2){
		   
	        char[] s1Chars = s1.toLowerCase().toCharArray();
	        char[] s2Chars = s2.toLowerCase().toCharArray();
	        Arrays.sort(s1Chars);
	        Arrays.sort(s2Chars);
	        String str1 = String.copyValueOf(s1Chars);
	        String str2 = String.copyValueOf(s2Chars);
	        
	        return str1.equals(str2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
        String s2 = "hello";
        if(Anagram.isAnagram(s1, s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
	}

}
