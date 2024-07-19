package com.info;

public class ReverseArray {

	
	
	
public static void main(String[] arg) {
		
//		int[] arr= {10,15,12,4,5,48,42,69,78,45};
		int[] arr= {10,15,18,48,69,78,85};
		
//		int[] rev = reverse(arr);
		int[] rev=reverseWithouExtraSpace(arr);
		for(int res:rev) {
			System.out.println(res);
		}
		
	}

private static int[] reverseWithouExtraSpace(int[] arr) {
	int i=0;
	int j=arr.length-1;
//	for(i=0 ;i<arr.length;i++) {
		while(i<j) {
		swapUsingTemp(arr,i, j);
		j--;
		i++;
//		}
	}
	return arr;
	
}
public static void swapUsingTemp(int[] arr,int a,int b) {
	int temp=arr[a];
     arr[a]=arr[b];
     arr[b]=temp;

}
private static int[] reverse(int[] arr) {
//	System.out.println(arr.length);
	int[] reverse=new int[arr.length-1];
	int j=0;
	for(int i=arr.length-1;i>0;i--) {
		reverse[j++]=arr[i]	;
	}
	return reverse;
}
}
