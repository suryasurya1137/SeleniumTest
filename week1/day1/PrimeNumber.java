package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		 int input = 13;
		boolean flag = false;
		
		for (int i = 2; i <input/2; i++) {
			
			if (input%i==0) {
				flag = true;
				break;
			     		}
			
		}
		if (flag == true) {
			System.out.println("Number is not a Prime");
			
		}
		else  {
			System.out.println("Number is Prime");
		}

	}

}
