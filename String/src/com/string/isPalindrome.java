package com.string;

public class isPalindrome {

	 public static Boolean isPalidrome(String s) {
		 String replace = s.replaceAll("[^a-zA-Z0-9]", "");
//		 String replace1 = s.replace(" ", "");
//		 String replace2 = replace1.replace(":", "");
//		 String replace = replace2.replace(",", "");
//		 System.out.println(replace.toLowerCase());
//		
		 String palidromeString="";
		 for(int i=replace.length()-1;i>=0;i--) {
			 palidromeString+=replace.charAt(i);
		 }
		return palidromeString.toLowerCase().equals(replace.toLowerCase());
	 }
	
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		System.out.println(isPalidrome(s));
	}

}
