package com.mypractice.logic;

import java.util.HashMap;
import java.util.Map;

public class PairOfIndices {
    /* This function returns pair of indices whose sum is given number "n". It returns 
     * the first matching pair and ignores the rest  */
    public static int[] pairIndices(int[] a, int n){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i=0; i<a.length; i++){
            //int sum = n - a[i];
            if(map.containsKey(a[i])){
                result[0] = map.get(a[i]);
                result[1] = i;
                break;
            }else{
                map.put(n - a[i], i);
            }                
        }
        return result;
    }
    
    public static void main(String args[]){
        
        int[] a={1,2,3,4,5,6,7,8,9,0};
        int n = 7;
        int[] pairIndices = PairOfIndices.pairIndices(a, n);
        System.out.println("Result = ["+pairIndices[0]+", "+pairIndices[1]+"]");        
    } 
    
}
