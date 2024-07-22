package com.info;
//considering only one number is uniq
public class UniqNumber {

	 public static int uniqueNumber(int[] arr) {
		int ans=Integer.MIN_VALUE; 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;i++) {
				if(arr[i]==arr[j]) {
					arr[i]=Integer.MIN_VALUE;
					arr[j]=Integer.MIN_VALUE;
				}
					
			}
		 
		}
		for(int i:arr) {
			if(i>Integer.MIN_VALUE)
				ans= i;
		}
		 return ans;
	 }
	
	
	public static void main(String[] args) {
		
//		int[] arr= {10,15,45,10,45,5};
		int[] arr= {-1,-1,-2};
       System.out.println("Unique number in array is : "+uniqueNumber(arr));
	}

}
