package week1.day1;

public class Palindrome {

	public static void main(String[] args) {

		String palindrome = "surya";
		String rev = "";
		// System.out.println(palindrome.length());

		for (int i = (palindrome.length() - 1); i >= 0; i--) {
			
			rev = rev + palindrome.charAt(i);

		}

		if (palindrome.equals(rev)) {

			System.out.println("The given String is a Palindrome");

		} else {
			System.out.println("This is not a Palindrome");
		}

	}

}
