package CCC;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			int a=input.nextInt();
			int n=input.nextInt();
			int s=0,x=0;
			for(int i=0;i<n;i++)
			{
				s+=(int) Math.pow(10, i)*a;
				x+=s;
				System.out.printf("%d",s);
				if(i!=n-1)
					System.out.printf("+");
				else 
				{
					System.out.printf("=");
					System.out.printf("%d\n",x);
				}
			}
		}

	}

}