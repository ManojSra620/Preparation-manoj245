package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TCS_Test_Pagefactory extends TCS_Test_Base
{
	private WebDriver dri;
	
	public void chrome()
	{
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		TCS_Test_Base nb=new TCS_Test_Base("Manoj");
		//nb.chromedriver(driver);
		nb.chgetter(driver);
		*/
	}

	public TCS_Test_Pagefactory(String name) 
	{
		
		super(name);
		TCS_Test_Base n=new TCS_Test_Base("Manoj");
		//TCS_Test_Base m=new TCS_Test_Base("Manoj");
		
	
		// TODO Auto-generated constructor stub
		System.out.println(name+"pagefactory");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//TCS_Test_Base nb=new TCS_Test_Base("Manoj");
		//nb.chromedriver(driver);
		n.chgetter(driver);
		//n.getter();
		
		this.dri=n.getter();
		//System.out.println("hero"+n.getter());
		
		//dri.get("https://phptravels.net/login");
		//PageFactory.initElements(n.getter(),this);
		PageFactory.initElements(dri,this);
		}
	
	@FindBy (name="email")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (xpath ="(//button[@type='submit']/span[@class='ladda-label'])[1]")
	WebElement loginbutton;	
		
		
	public void login(String usr, String pwd)
	{
		dri.get("https://phptravels.net/login");
		username.sendKeys(usr);
		password.sendKeys(pwd);
		loginbutton.click();
		
	}
	
	public void close()
	{
		dri.close();
	}

}
