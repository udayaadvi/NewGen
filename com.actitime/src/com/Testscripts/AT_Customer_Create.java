package com.Testscripts;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.framework.SuperTestNG;




public class AT_Customer_Create  extends SuperTestNG{
	
	@Test(groups = { "customer" })
	public void testAT_Customer_Create() {
		projectMethod.login("admin", "manager");
		projectMethod.goToProjectsAndCustomerpage();
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("uday");
		driver.findElement(By.name("createCustomerSubmit")).click();
		String eMsg = "Customer \"uday\" has been successfully created.";
		projectMethod.verifyMessage(eMsg);
		projectMethod.logOut();
	}


}
