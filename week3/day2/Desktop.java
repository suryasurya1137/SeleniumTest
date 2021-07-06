package week3.day2;

public class Desktop implements HardWare,Software {

	public void softwareResources() {
		System.out.println("20");
		
	}

	public void hardwareResources() {
		System.out.println("40");
		
	}
	public void fewMore() {
		System.out.println("new methods rather than Interface");

	}
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.hardwareResources();
		obj.softwareResources();
		obj.fewMore();
	}

	public void hardWares() {
		// TODO Auto-generated method stub
		
	}

	public void hard() {
		// TODO Auto-generated method stub
		
	}
	

}
