package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"url","APIkey/username"})
		@Test
		public void WebLoginHomeLoan(String urlname,String key)
		{
			System.out.println("weblogin homeloan");
			System.out.println(urlname);
			System.out.println(key);
		}
		@Test
		public void MobileLoginHomeLoan()
		{
			System.out.println("mobile login homeloan");
		}
		@Test(groups= {"Smoke"})
		public void ApiLoginHomeLoan()
		{
			System.out.println("api login homeloan");
		}

	}



