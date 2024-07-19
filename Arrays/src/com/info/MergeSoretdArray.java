package com.info;

public class MergeSoretdArray {
	
  public static void main(String[] arr) {
	  int[] num1= {1,2,3};
	  int m=num1.length;
	  int[] num2= {2,5,6};
	  int n=num2.length;
	  int[] result=mergeSortedArray(num1, m, num2, n);
	  for(int res:result) {
		  System.out.println(res);
	  }
	  
  }
  
  public static int[] swap(int[] arr,int a,int b) {
	  int temp=arr[a];
	   arr[a]=arr[b];
	   arr[b]=temp;
	   
	  return arr;
	  
  }
  public static int[] mergeSortedArray(int[] num1,int m,int[] num2,int n) {
	  int[] sortedArray=new int[m+n];
	  for(int i=0;i<sortedArray.length-n;i++) {
		
		 sortedArray[i]=num1[i];
	  }
	  for(int i=0;i<sortedArray.length-m;i++) {
			
			 sortedArray[m+i]=num2[i];
	  }
	for(int i=0;i<sortedArray.length;i++) {
		for(int j=i+1;j<sortedArray.length;j++) {
			if(sortedArray[i]>sortedArray[j]) {
				swap(sortedArray, i, j);
			}
		}
		
	  }
	return sortedArray;
  }
}
