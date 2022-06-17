package NNN;

import java.util.Scanner;

public class Main {
   
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Season s=Season.Spring;
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==3||n==4||n==5)
			    s=Season.Spring;
			else if(n==6||n==7||n==8)
			    s=Season.Summer;
			else if(n==9||n==10||n==11)
			    s=Season.Autumn;
			else if(n==12||n==1||n==2)
			    s=Season.Winter;
			else
			{
				System.out.println("invalid month!");
				continue;
			}
			switch (s)
			{
			case Spring:
				System.out.println("spring:Spring blossoms make you feel comfortable.");
				break;
			case Summer:
				System.out.println("summer:It's a little hot.");
				break;
			case Autumn:
				System.out.println("autumn:The autumn wind sweeps the fallen leaves and the weather turns cool.");
				break;
			case Winter:
				System.out.println("winter:It's too cold.");
				break;
			}
			s=null;
		}

	}

}
enum Season
{
	Spring,Summer,Autumn,Winter
}