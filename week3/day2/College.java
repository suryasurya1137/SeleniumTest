package week3.day2;

public class College extends University {

	
	public void ug() {
		System.out.println("2 lakh fees");
		
	}
	
	public void check() {
		System.out.println("check");
	}
	
	
	public static void main(String[] args) {
		
		College obj = new College();
		obj.ug();
		obj.pg();
		obj.check();
		
		University obj1=new College();
		obj1.pg();
		obj1.ug();
	
		
	}

	
}
