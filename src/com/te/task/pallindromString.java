package com.te.task;

public class pallindromString {
	public static void main(String[] args) {
		String str = "MoM";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not palindrome");

	
	}

}
