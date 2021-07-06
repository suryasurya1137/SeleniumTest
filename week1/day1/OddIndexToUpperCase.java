package week1.day1;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";

		char a[] = test.toCharArray();

//		   System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

//			System.out.println(a[i]);

			if (i % 2 == 1) {

				System.out.print(Character.toUpperCase(a[i]));;

			}else
				System.out.print(a[i]);
		}
		/*
		 * for (int j = 0; j < a.length; j++) {
		 * 
		 * System.out.print(a[j]);
		 * 
		 * }
		 */

	}

}
