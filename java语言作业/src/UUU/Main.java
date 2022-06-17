package UUU;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String str=in.nextLine();
			str=str.trim();
			String str1="";
			int sum=0;
			int i1=0;
			if(str!=null)
			{
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)>=48 && str.charAt(i)<=57)
					{
						str1+=str.charAt(i);
						if(i==str.length()-1)
						{
							i1=Integer.parseInt(str1);
							sum+=i1;
							str1="";
						}
						
					}
					else
						if(i>0 && str.charAt(i-1)>=48 && str.charAt(i-1)<=57)
						{
							if(str1!=null)
							{
							i1=Integer.parseInt(str1);
							sum+=i1;
							str1="";
							}
						}
					
					
				}
			}
			System.out.printf("%d",sum);
		}
	}

}
