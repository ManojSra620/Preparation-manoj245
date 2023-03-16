package Com_framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

abstract class Vehicle 
{
	static String steeringwheel="leather";	
	private int minSpeed;
	WebDriver driver;
	public Vehicle(int minspeed)
	{

		this.minSpeed=minspeed;
System.out.println("vehicle const "+minSpeed);
	}


	public void setter(int s)
	{
		minSpeed=s;
	}

	public int getter()
	{
		return minSpeed;	
	}

	protected void tyre() throws IOException
	{
TakesScreenshot t= (TakesScreenshot)driver;
File f=t.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File("C:\\Desktop\\man.png"));
	}

	protected void Body()
	{

	}


}

public class Bus extends Vehicle
{
	
	public Bus (int i) 
	{
	super(100);	
	System.out.println(i);
	}
	
	public static void main(String[] args) 
	{
		Bus b=new Bus(200);
		//System.out.println();
		b.setter(6);
		
		System.out.println(b.getter());
		
		
	}
	

}
