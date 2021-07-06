package week1.day1;

import org.bouncycastle.util.Arrays;

import com.google.common.primitives.Chars;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		
		char c = str.charAt(1);
		//char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == c) {
				

				count++;	
			}

		}System.out.println(count);
		
				
		/*
		 * int length = str.length(); String str2 = str.replace("e", ""); int length2 =
		 * str2.length();
		 * 
		 * System.out.println(length-length2);
		 */
		

	}

}
