package Com.google.thread;

import Com.Qa.pages.googlepage;

public class googlefeaturesThread extends Thread {
	
	public String browsername;
	googlepage Googlepage;
	
	public googlefeaturesThread(String threadname, String browsername) {
		
		super(threadname);
		
		this.browsername = browsername;
		Googlepage = new googlepage();
		
	}
	
	@Override
	
	public void run() {
		
		System.out.println("thread----started" + Thread.currentThread().getName());
		
		
		try {
			Thread.sleep(1000);
			Googlepage.setUp(this.browsername);
			Googlepage.googleSearchTest();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Googlepage.tearDown();
		}

		System.out.println("thread - ended " + Thread.currentThread().getName());
	}


}
