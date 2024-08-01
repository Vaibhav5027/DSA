package com.string;

public class LengthOfWord {
   
	public static int lengthOfWOrd(String s) {
		String[] split = s.split(" ");
	   String string = split[(split.length)-1];
		return string.length();
	}
	public static void main(String[] args) {
		String string = "Hello Words";
		System.out.println(lengthOfWOrd(string));
	}

}
