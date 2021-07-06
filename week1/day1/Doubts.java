package week1.day1;

import java.util.Arrays;

public class Doubts {

	public static void main(String[] args) {

		String palindrome = "madam";
		String palindrome1 = new String("Madam");
		String rev = "";
		
		int length = palindrome.length();
		
		char[] ch = palindrome.toCharArray();
		String valueOf = String.valueOf(ch);
		System.out.println(valueOf);
		String string = Arrays.toString(ch);
		System.out.println(string);
		/*
		 * System.out.println(palindrome.charAt(0)); System.out.println(palindrome ==
		 * palindrome1); System.out.println(palindrome.hashCode());
		 * System.out.println(palindrome1.hashCode());
		 * System.out.println(palindrome.equals(palindrome1));
		 * System.out.println(palindrome.equalsIgnoreCase(palindrome1));
		 */
		 
		for (int i = 0; i < ch.length; i++) {
			
			System.out.print(ch[i]);
			
			
		}

	}

}
