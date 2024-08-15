package prep;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Prep_Appium 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		AppiumDriverLocalService srv = null;
		srv.start();
		UiAutomator2Options ui=new UiAutomator2Options();
		ui.setPlatformName("").setPlatformVersion("").setAutomationName("").setDeviceName("").setApp(""); // setappactivity, setapppackage
		
		URL ur=new URL("");
		AppiumDriver apd=new AppiumDriver(ur,ui);
		
	}

}
