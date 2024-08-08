package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sample_keyworddriven2 
{
	//WebDriver d;
	public void pgm2(WebDriver d)
	{
		d.findElement(By.linkText("CSR")).click();
	}
	
	public void pgm3(WebDriver d)
	{
		d.findElement(By.linkText("Newsroom")).click();
	}

}
