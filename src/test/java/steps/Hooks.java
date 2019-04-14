package steps;

import org.junit.After;
import org.junit.Before;

public class Hooks extends Home{
	@Before
	public void method() {
		System.out.println("before method");
	    Home h=new Home();
		h.getId();
			}
	@After
	public void method2() {
		System.out.println("after method");
		quitBrowser();
	}
}
