package Com_framework;

import java.util.Scanner;

public class palindrome 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		int pal=0;
		//12345
		while(num!=0)
		{
		pal=pal*10+num%10;   //pal 1, num 23;  pal 13, num 2; 
		num=num/10;
		}
		System.out.println(pal);
	}

}
