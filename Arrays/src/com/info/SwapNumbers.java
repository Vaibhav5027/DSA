package com.info;

public class SwapNumbers {
	
	public static void swapUsingTemp(int a,int b) {
		System.out.println("before swap a:"+a+ "b: "+b);
		int temp=a;
	     a=b;
         b=temp;
 		System.out.println("after swap a:"+a+ "b: "+b);

	}
	
	
	public static void main(String[] args) {
      swapUsingTemp(3, 4);
	}
}
