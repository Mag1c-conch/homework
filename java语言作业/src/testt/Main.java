package testt;

import java.util.*;
public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			double a=input.nextDouble();
			double b=input.nextDouble();
			double c=input.nextDouble();
			if(a<=0||b<=0||c<=0)
			{
				System.out.println("not a triangle!");
			}
			else if(a+b<=c||a+c<=b||b+c<=a)
			{
				System.out.println("not a triangle!");
			}
			else
			{
				double p=(a+b+c)/2;
				double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				System.out.printf("%.2f\n",s);
			}
		}	
	
	}
}