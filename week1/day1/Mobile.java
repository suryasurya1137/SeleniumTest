package week1.day1;

public class Mobile {
	
	public String mobileModel = "Samsung";
	public int mobileWeight = 500;
	public boolean isFullCharge = false;
	public double mobileCost = 1223.23;
	public long mobileCapacity = 12345678L;
	public float glassWeight = 123.34F;
	

	public static void main(String[] args) {
		
		Mobile driver = new Mobile();
		driver.makeCall();
		driver.sendMsg();
		System.out.println(driver.mobileModel);
		System.out.println(driver.mobileCost);
		System.out.println(driver.mobileWeight);
		System.out.println(driver.isFullCharge);
		System.out.println(driver.glassWeight);
		System.out.println(driver.mobileCapacity);

	}
	
	public void makeCall() {
		int a=5;
			
		System.out.println(a);
		System.out.println("Make the call");
	}
	public void sendMsg() {
		System.out.println("Send message");

	}
}
