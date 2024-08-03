package com.string;

public class ReverseStringArray {

	public static void swap(char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

	public static void reverseString(char[] s) {

		int i = 0;
		int j = s.length-1;
		while (i < j) {
         swap(s,i,j);
         i++;
         j--;
		}
   
	}

	public static void main(String[] args) {
      char[] s	={'h','e','l','l','o'};
       reverseString(s);
	}

}
