package test;

import org.testng.IClassListener;
import org.testng.ITestClass;

//ITestListener interface which implements testng listeners

public class Listeners implements IClassListener
{

	@Override
	public void onBeforeClass(ITestClass testClass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
		System.out.println("im successfell class");
		// TODO Auto-generated method stub
		
	}

}
