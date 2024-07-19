package com.info;

public  class SmallestAndBiggest {

	
	public static void checkSmallestAndLargestNumber(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}	
		}
		System.out.println("Minimum element : "+min + " ,"+ "Maximum element: "+max);
	}
	public static void main(String[] args) {
		int[] arr= {10,15,12,4,5,48,42,69,78,45};
		checkSmallestAndLargestNumber(arr);

	}

}
