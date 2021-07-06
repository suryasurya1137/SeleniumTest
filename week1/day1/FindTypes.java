package week1.day1;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int letter = 0, num = 0, space = 0, specialCharacter = 0;
		char[] ch = test.toCharArray();
		
		for ( int i=0; i < ch.length; i++) {
			
			if (Character.isLetter(ch[i])) 
				letter++;
			if (Character.isDigit(ch[i])) 
				num++;
			if (Character.isSpaceChar(ch[i])) 
				space++;
			else {		
				specialCharacter++;
			}			
		}
		System.out.println(letter);
		System.out.println(num);
		System.out.println(space);
		System.out.println(specialCharacter);
	}
}

