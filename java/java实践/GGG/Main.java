package GGG;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int judge=1;
			String str=in.nextLine();
			int[] arr=new int[100];
			for(int i=0;i<str.length();i++)
			{
				arr[i]=str.charAt(i)-'0';
				if(i>0&&arr[i]>arr[i-1]||i==0)
					continue;
				else
				{
					judge=0;
					System.out.println("no");
					break;
				}
			  
			}
			if(judge==1)
				  System.out.println("yes");
		}

	}

}
