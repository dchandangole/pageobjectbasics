package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class ZohoAppPage extends Page {
	


	public CRMHomePage gotoCRM() {
		
		//driver.findElement(By.cssSelector("._logo-crm")).click();
		click("crmlink_CSS");
		
		return new CRMHomePage();

	}

	public void gotoMail() {

	}

	public void gotoBooks() {

	}
}
