package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
			int first = 0;
			int second = 1;
			int range = 8;
			int sum;
			System.out.println(first);
			System.out.println(second);
			for (int i = 2; i <range; i++) {
					sum = first+second;
					first = second;
					second = sum;
					System.out.println(sum);
			
				}
				
	}

}
