package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 { 
	@AfterTest
	public void lastexecution()
	{
		System.out.println("i will execute last");
	}
	
  @Test(enabled=false)
	public void demo()
	{
	     System.out.println("Hello");
	}
  
  @AfterSuite
  public void afsuite()
  {
	  System.out.println("im the last number");
  }
  
@Test(timeOut=4000)
public void demo2()

{
	System.out.println("bye");
}

}
