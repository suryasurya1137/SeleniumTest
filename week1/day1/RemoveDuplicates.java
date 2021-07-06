package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.cucumber.messages.internal.com.google.common.primitives.Chars;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String a = "Paypal India";
		char[] ch = a.toCharArray();
		
		//String[] array = {"surya","sudhagar"};
		
		//List<Character> asList = Chars.asList(ch);
		// List<String> asList = Arrays.asList(array);
		//System.out.println(asList);
		//System.out.println(asList);
		
		
		Set<Character>  charSet = new HashSet<Character>();
		Set<Character>  dupCharSet = new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			
			boolean add = charSet.add(ch[i]);
			
			if (add == false) {
				dupCharSet.add(ch[i]);
			}			
					
			}
		charSet.removeAll(dupCharSet);
		//System.out.println(charSet);
		
		List c = new ArrayList(charSet);
		
		for (int i = 0; i < c.size(); i++) {
		
			 String d=" ";
			 
			 if (c.get(i).equals(d) ) {
				 System.out.println(c.get(i));
				
			}
			 //System.out.println(Character.isSpaceChar(c.get(i)));
			// System.out.println(c.get(i));
			 //System.out.println(c.get(i));
			/*
			 * if (c.get(2).equals(d)) {
			 * 
			 * break; } else System.out.print(c.get(i));
			 */
					
		}
		
		
		/*
		 * System.out.println(dupCharSet);
		 * 
		 * System.out.println(charSet.size());
		 * System.out.println(charSet.removeAll(dupCharSet));
		 * 
		 * System.out.println(charSet);
		 */
		
				
		
	}

}
