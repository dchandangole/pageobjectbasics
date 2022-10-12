package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page {

	

	public ZohoAppPage doLogin(String username) {
		
		type("email_CSS", username);
		click("nextbtn_CSS");
		
		
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click("nextbtn_CSS");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ZohoAppPage();
		
		

	}

	public void goToLearnMore() {

	}

}
