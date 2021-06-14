package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int calculated = 0;
		int remainder;
		int originalNum = 153;
		int input = originalNum;
		
		while(input>0) {
			
			remainder = input % 10;
			calculated = calculated +(remainder*remainder*remainder);
			input = input / 10;
		}
		
		if(originalNum == calculated) {
			
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Amstrong Number");
		}

	}

}
