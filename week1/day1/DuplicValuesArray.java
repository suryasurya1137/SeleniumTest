package week1.day1;

public class DuplicValuesArray {

	public static void main(String[] args) {
		
			//int[] a = new int[7];
			int a[] = { 2, 4, 6, 8, 4, 6, 10 };
		
		for (int i = 0; i < a.length; i++) {
			
			
			for (int j = i+1; j < a.length; j++) {			
					
				  if (a[i]==a[j]) 
				  { System.out.println("duplicate value "+ a[i]); }
				 
			}
			
			
		}

	}

}
