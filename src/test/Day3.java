package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@AfterClass
	public void aftclass()
	{
		System.out.println("after executing all methods in class ");
	}
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("weblogin carloan");
		
	}

     @Test
	public void MobileLoginCarLoan()
	{
		System.out.println("mobile login carloan");
		
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("im executing before each and everytest method in Day3 class");
	}
	@BeforeClass
	public void befclass()
	{
		System.out.println("before execting any methds n the class");
	}
	@Test(groups= {"Smoke"})
	public void MobileSigninCarLoan()
	{
		System.out.println("mobile signin carloan");
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("im executing after each and everytest method in Day3 class");
	}
	
	@Test
	public void MobileLogoutCarLoan()
	{
		System.out.println("mobile logout carloan");
	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("im no.1");
	}


	@Test(dependsOnMethods= {"WebLoginCarLoan","MobileSigninCarLoan"})
	public void ApiLoginCarLoan()
	{
		System.out.println("api login carloan");
	}

}
