package PPP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			double a=in.nextDouble();
			double b=in.nextDouble();
			double c=in.nextDouble();
			if(a<=0||b<=0||c<=0)
			{
				System.out.println("The length of edge must be greater than 0!");
			}
			else if(a+b<=c||a+c<=b||b+c<=a)
			{
				System.out.println("The Trilaterals cannot form a triangle.");
			}
			else
			{
				double p=(a+b+c)/2;
				double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				double z=a+b+c;
				System.out.printf("area:%.2f perimeter:%.2f\n",s,z);
			}
		}	

	}

}
