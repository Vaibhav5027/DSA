package com.info;

public class MissingNumber {
    
	
	public static void swap(int[] nums,int a,int b) {
		
		int temp=nums[a];
		nums[a]=nums[b];
		nums[b]=temp;
 		

	}
	public static int missingNumber(int nums[]) {
       int num=0;
	  for(int i=0;i<nums.length;i++) {
		  for(int j=i+1;j<nums.length;j++) {
			  if(nums[i]>nums[j]) {
				  swap(nums,i,j);
			  }
			  }
		  }

	  for(int i=0;i<nums.length;i++) {
		  int a=nums[i];
		  if(nums[i]!=i) {
			  num= i;
			  break;
		  }
		  else
			  num=nums.length;
	  }
	  return num;
	  }	
		 


	public static void main(String[] args) {
//		 int[] nums= {0,1,3,4,5,6};
		int[] nums= {0};
		 System.out.println(missingNumber(nums));
	}
}
