package DDD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			int n=input.nextInt();
			if(n%2==0)
				n+=1;
			int x=n/2+1;
			 for(int i=x;i>=1;i--){   
		            for(int j=1;j<=n;j++)
		            {
		                if(i==j)
		                {
		                    System.out.print("*");
		                    if(i==x)
		                    	break;
		                }
		                else if(j==n+1-i)
		                {
		                    System.out.print("*");
		                    break;
		                }
		                else
		                {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		        
		        for(int i=2;i<=x;i++)
		        {   
		            for(int j=1;j<=n;j++)
		            {
		                if(i==j)
		                {
		                    System.out.print("*");
		                    if(i==x)
		                    	break;
		                }
		                else if(j==n+1-i)
		                {
		                    System.out.print("*");
		                    break;
		                }
		                else
		                {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
			}
		}
	}
