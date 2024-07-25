package com.info;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
public static void main(String[] args) {
       int[] arr= {-1,0,1,2,-1,-4};
		
       System.out.println("set of the sums : "+threeSum(arr));
     
	}
private static List<List<Integer>> threeSum(int[] arr) {
	List<List<Integer>> list=new ArrayList<>();
	HashSet<List<Integer>> hashSet=new HashSet<>();
	java.util.Arrays.sort(arr);
	  for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  for(int k=j+1;k<arr.length;k++) {
				  if((arr[i]+arr[j]+arr[k]==0)&&(i!=j&&i!=k&&j!=k)) {
					List<Integer> subList=new ArrayList<>();
					  subList.add(arr[i]);
					  subList.add(arr[j]);
					  subList.add(arr[k]);
					  hashSet.add(subList);
				  } 
			  }
		  }
	  }
	  list.addAll(hashSet);
	 return list;
}
}
