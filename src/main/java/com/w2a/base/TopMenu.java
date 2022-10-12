package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	/*
	 * TopMenu ISA Page ??
	 * 
	 * HomePage HASA TopMenu
	 * 
	 * AccountsPage HAS TopMenu
	 * 
	 * 
	 * 
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}
	

	public void gotoHome() {

	}

	public void gotoFeeds() {
	}

	public AccountsPage gotoAccounts() {
		
		//driver.findElement(By.cssSelector("div.lyteItem:nth-child(4) > a")).click();
		Page.click("accountstab_CSS");
		return new AccountsPage();
	}

	public void signOut() {

	}

}
