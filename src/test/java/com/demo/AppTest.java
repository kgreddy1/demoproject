package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	
	public void testlogin1() {
		App myapp = new App();
		Assert.assertEquals(0, myapp.userLogin("admin","admin123"));
	}
	
	@Test
	
	public void testlogin2() {
		App myapp = new App();
		Assert.assertEquals(1, myapp.userLogin("admin","admin@123"));
	}
}
