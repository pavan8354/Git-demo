package Googetestrunner;

import Com.google.thread.googlefeaturesThread;

public class googletestrunner {
	
	public static void main(String ar[]) {

	
	 Thread t1 = new googlefeaturesThread("chrome thread", "chrome");
			 Thread t2 = new googlefeaturesThread("firefox thread", "firefox");
			 
			 System.out.println("Thread started------->>>");
			
			t1.start();
//			t2.start();
			
	}

}
