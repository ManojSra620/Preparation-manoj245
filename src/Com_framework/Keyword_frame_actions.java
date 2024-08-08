package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keyword_frame_actions 
{
	public void blogs(WebDriver d)
	{
		d.findElement(By.linkText("Blogs")).click();
		
	}
	
	public void aboutus(WebDriver d)
	{
		d.findElement(By.xpath("(//a[@navigation-title='About us'])[1]")).click();
		
	}
	
	public void careers(WebDriver d)
	{
		d.findElement(By.className("levelOneLink is-hidden")).click();
		
	}

}
