package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String x = "stops";
		String y = "postsss";
		
		if (x.length() == y.length()) {

			 char a[] = x.toCharArray();
			 char b[] = y.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);
			// comparing two char arrays
		boolean equals = Arrays.equals(a, b);
		
			if (equals)
			{

				 System.out.println("This is Anagram");

			} 
			
		}else
			System.out.println("Not an anagram");

		// converting char array into string and then comparing below

		/*
		 * if (String.valueOf(a).equals(String.valueOf(b))) {
		 * 
		 * System.out.println("This is Anagram"); } else {
		 * System.out.println("Not an Anagram"); }
		 */

	}}


