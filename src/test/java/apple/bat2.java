package apple;

import org.testng.annotations.Test;

public class bat2 {

	@Test(priority=1)
	void close() {
		System.out.println("testng");
	}

	@Test(priority=2)
	void  app() {
		System.out.println("log4j");
	}
	@Test(priority=3)
	void login() {
		System.out.println("maven");
	}
	@Test(priority=4)
	void logout() {
		System.out.println("pageobject");
	}
	@Test(priority=5)
	void addemp() {
		System.out.println("github");
	}
	}


