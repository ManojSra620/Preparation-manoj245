package Com_framework;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Kill_process 
{
	private static final String TASKLIST="cmd";
	private static final String kill="taskkill /F /IM ";
	Process P;
	@Test
	public void after() throws IOException
	{
		String processname=null;
		
		//if(module.equalsIgnoreCase("zenajob"))
		if(1==1)
		{
			processname="ReadyAPI.exe";
		}
		else
		{
			processname="ceraexe().exe";
		}
		
		killprocess(processname);
		if(P!=null)
		{
			P.destroy();
		}
		
	}
	
	
	public static void killprocess(String servicename) throws IOException
	{
		Runtime.getRuntime().exec(kill+servicename);
	}

}
