package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	
	public void demo3()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("iwill execute first");
	}

}
