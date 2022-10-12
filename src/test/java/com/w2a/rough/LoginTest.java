package com.w2a.rough;


import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
		
		
		//this is a rough package

		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("durgesh.chandangole99@gmail.com");
		zp.gotoCRM();
		AccountsPage account= Page.menu.gotoAccounts();
		CreateAccountPage cap=  account.gotoCreateAccounts();
		cap.createAccount("Durgesh");
		
		
	}

}
