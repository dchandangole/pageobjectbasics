package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.base.TopMenu;

public class AccountsPage extends Page {
	
	
	
	
	public CreateAccountPage gotoCreateAccounts() {
		
		click("createaccountbtn_CSS");
		return new CreateAccountPage();
		
		
	}
	
	

}
