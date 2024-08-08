package Com_framework;

import java.time.Duration;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appium_sample 
{
	public void test_appium()
	{
		UiAutomator2Options ui=new UiAutomator2Options();
		
		
		AndroidDriver dd=new AndroidDriver(ui);
		dd.runAppInBackground(Duration.ofSeconds(20));
		dd.pressKey(new KeyEvent(AndroidKey.CLEAR));
	//	dd.pressKey(new KeyEvent(AndroidKey.));
		dd.terminateApp("");
	}

}
