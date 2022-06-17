package JJJ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int h1=in.nextInt();
			int h2=in.nextInt();
			int[] h=new int[10];
			int n=0;
			for(int i=0;i<10;i++)
			{
				h[i]=in.nextInt();
				if(h1+h2>=h[i])
				{
					n++;
				}
				
			}
			System.out.printf("%d",n);
			System.out.println("");
		}

	}

}
