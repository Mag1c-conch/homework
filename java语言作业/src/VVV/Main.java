package VVV;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int x=0;x<3;x++)
		{
			int m=in.nextInt();
			int l=m;
			for(int i=1;i<=m;i++)    //上半
			{
				for(int k=1;k<=i;k++)    //左半
				{
		             System.out.print(k);
		             if(k==i)
		             {
		            	 int c=k;
		            	 for(;k<m;k++)
		            	 {
		            		 System.out.print(c);
		            	 }
		            	 c=i;
		             }
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
