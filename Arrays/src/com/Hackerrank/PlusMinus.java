package com.Hackerrank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
   
	public static void solution(List<Integer> arr) {
		int positiveCount=0;
	      int negativeCount=0;
	      int zeroCount=0; 
	      int size=arr.size(); 
	      for(int i=0;i<arr.size();i++){
	          int value=arr.get(i);
	          if(value>0){
	              positiveCount++;
	          }
	          else if(value<0){
	              negativeCount++;
	          }
	          else{
	             zeroCount++; 
	          }
	      }
	      System.out.println((double)positiveCount/size);
	      System.out.println((double)negativeCount/size);
	      System.out.println((double)zeroCount/size);
	    }
		

	  
	public static void main(String[] args) {
		 
		  List<Integer> arr=Arrays.asList(1,1,0,-1,-1);
		  solution(arr);
	
	}

	
}
