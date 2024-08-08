package Com_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Using_propertyfile 
{

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\test-output\\url.proprties");
		FileInputStream fip=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fip);
		String weburl=p.getProperty("Url");
		System.out.println(weburl);
		String myname=p.getProperty("name");
		System.out.println(myname);
		
		int a=10;
		int b=20;
		//int a=a*b; not allowing to assign a=a*b
		System.out.println(a);

	}

}
