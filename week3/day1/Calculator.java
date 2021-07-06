package week3.day1;

import org.apache.commons.math3.analysis.function.Subtract;
import org.apache.xpath.operations.Div;
import org.bouncycastle.operator.AADProcessor;

public class Calculator {
	
	private void add(int num1, int num2) {

		System.out.println(num1 + num2);

	}

	private void add(int num1, int num2, int num3) {
		
		System.out.println(num1 + num2 + num3);

	}

	private void mutiply(int num1, int num2) {
		System.out.println(num1 * num2);

	}

	private void mutiply(int num1, double num2) {
		System.out.println(num1 * num2);

	}

	private void subtract(int num1,int num2) {
		System.out.println(num1 - num2);

	}

	private void subtract(double num1,double num2) {
		System.out.println(num1 - num2);

	} 
	private void divide(int num1, int num2) {
		System.out.println(num1/num2);

	}
	private void divide(int num1,double num2) {
		System.out.println(num1/num2);

	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.add(5, 5);
		obj.add(3, 3, 3);
		obj.mutiply(5, 5);
		obj.mutiply(5, 2.5);
		obj.subtract(2.5, 1.5);
		obj.subtract(3, 3);
		obj.divide(5, 5);
		obj.divide(5, 1.5);
		
	}

}
