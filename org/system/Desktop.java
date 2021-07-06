package org.system;

public class Desktop extends Computer {
	
	private void desktopSize() {
		
		System.out.println("Desktop Size");
	}
	
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.desktopSize();
		obj.computerModel();
	}
	
}
