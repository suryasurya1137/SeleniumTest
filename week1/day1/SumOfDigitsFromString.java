package week1.day1;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		SumOfDigitsFromString obj= new SumOfDigitsFromString();
		obj.method1();
		obj.method2();

	}
	
	private void method1() {
		String text = "Tes12Le79af65";
		int sum = 0;
		/*
		 * // String text2 = text.replace('e', 't'); // String b =
		 * text.replaceFirst("e", "h"); String text2 = text.replaceAll("[a-z]", "");
		 * System.out.println(text2);
		 */
		String replaceAll = text.replaceAll("\\D", "");
		//System.out.println(replaceAll);
		char[] ch = replaceAll.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			//System.out.println(ch[i]);
			int numericValue = Character.getNumericValue(ch[i]);
			sum = sum + numericValue;
		}
		System.out.println(sum);
	}
	private void method2() {
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] ch = text.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isDigit(ch[i])) {
				
				sum=sum+ Character.getNumericValue(ch[i]);
				}
		}
		
		System.out.println(sum);

	}

}
