package com.Testscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.framework.SuperTestNG;

public class AT_Customer_Delete extends SuperTestNG {
	@Test(groups = { "customer" })
	public void testAT_Customer_Delete() {

		projectMethod.login("admin", "manager");
		projectMethod.goToProjectsAndCustomerpage();
		driver.findElement(By.xpath("//tr[td[table[tbody[tr[td[a[text()='uday']]]]]]]/td[6]/input")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		driver.findElement(By.id("deleteButton")).click();
		String eMsg = "Selected customers have been successfully deleted.";
		projectMethod.verifyMessage(eMsg);
		projectMethod.logOut();
	}


}
