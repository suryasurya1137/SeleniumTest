package week1.day1;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator driver = new Calculator();
		
		System.out.println(driver.add(5,5));
		System.out.println(driver.add(5,5));
		System.out.println(driver.add(5,5));
		
		driver.sub(2.2, 3.3);
		driver.mul(2.2, 3.3);
		driver.divide(10,5);
		
	}
	
	public int add(int a, int b) {
		
		int sum= a+b;
		return sum;
		
	}
	public double sub(double a, double b) {
		
		double sub= a-b;
		return sub;
	}
	public double mul(double a, double b) {
		
		double mul= a*b;
		return mul;
	}
    public double divide(int a, int b) {
		
		double divide= a/b;
		return divide;
		
    }

}
