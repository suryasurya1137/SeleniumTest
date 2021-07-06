package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp() {
		
		System.out.println("Connect Whatsapp");

	}
	//Override concept by creating same method name in child, priotity to child 
	public void takeVideo() {
		
		System.out.println("take Video");

	}
	
	public static void main(String[] args) {
		SmartPhone a = new SmartPhone();
		a.takeVideo();
	}
}
