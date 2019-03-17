package test;

import java.io.IOException;

import org.testng.annotations.Test;

public class Inheritence extends globalparameters
{
	
	@Test
	public void openingbrowser() throws IOException
	{
		Login();
		System.out.println("executing opening browser");
	}

	@Test
	public void flightbooking() throws IOException
	{
		Login();
		System.out.println("flight booking");
	}
}
