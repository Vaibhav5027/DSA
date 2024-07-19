package com.info;

public class Sorting {

	public static boolean checkSorted(int[] arr) {
		boolean result=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) {
				
			  result=true;
			}
			else
				result=false;
			
		}
		
		return result;
	}
	
	public static void main(String[] arg) {
		
//		int[] arr= {10,15,12,4,5,48,42,69,78,45};
		int[] arr= {10,15,18,48,69,78,85};
		
		System.out.println("Given array is sorted: "+checkSorted(arr));
		
	}
	
}
