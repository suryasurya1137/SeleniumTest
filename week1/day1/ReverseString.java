package week1.day1;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		//System.out.println(test.length());
		for (int i = test.length()-1; i >=0; i--) {
			
			System.out.print(test.charAt(i));
			
		}
		
		System.out.println();
		
		char[] ch = test.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			
			System.out.print(ch[i]);
			
		}

	}

}
