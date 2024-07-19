package com.info;

public class Dublets {
    
	public static int doublets(int[] arr ,int target) {
		int pairs=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					pairs++;
				}
			}	
		}
		return pairs;
	}
	
	public static int triplets(int arr[] ,int target) {
		int pairs=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
				if(arr[i]+arr[j]+arr[k]==target) {
					pairs++;
				}
			}	}
		}
		return pairs;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {10,15,12,4,5,48,42,69,78,45,8,1,3};
		System.out.println("the total number of pairs: "+doublets(arr, 9));
		System.out.println("the total number of pairs: "+triplets(arr, 21));
		
	}
}
