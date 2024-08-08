package Com_framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner_bufrdreader__Test
{

	public static void main(String[] args) throws IOException
	{
	System.out.println("scanner");
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	System.out.println("Input value is "+i);
	
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	String st=b.readLine();
	System.out.println("entered string is "+st);

	}

}
