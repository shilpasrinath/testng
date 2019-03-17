package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5 {
	
	
	@Test(dataProvider="getData")
	public void MobileLoginHomeLoan(String username,String password)
	{
		System.out.println("mobile login homeloan");
		System.out.println(username);
		System.out.println(password);

	}
    @DataProvider
    public Object[][] getData()
    {
    	//1st combination-username password-good credit history-row
    	//2nd combination-username password-no credit history
    	//3rd combination-fraud credit history
    	Object[][] data =new Object[3][2];
    	//1st set
    	data[0][0]="firstusername";
    	data[0][1]="password";
    	//columns in the row are nothing but values for that particular combination(row)
    	//2nd set
    	data[1][0]="secondusername";
    	data[1][1]="secondpassword";
    	//3rd set
    	data[2][0]="thirdusername";
    	data[2][1]="thirdpassword";
    	return data;
   
    }

}
