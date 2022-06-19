package AAA;

import java.util.Scanner;

class juzhen{
	int [][] arr=new int[100][100];
	int n;
	int k=1;
	int m=0;
	public void count(int n)
	{
		int x=n;
		for(int i=0;i<n;i++)
		{
			m=i;
			for(int j=0;j<x;j++,m++)
			{
				arr[m][j]=k;
				k++;
			}
			x-=1;
		}

	}
	
}



public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			juzhen aa=new juzhen();
			aa.n=in.nextInt();
			
			aa.count(aa.n);
			for(int i=0;i<aa.n;i++)
			{
				for(int j=0;j<i+1;j++)
				{
					System.out.printf("%4d",aa.arr[i][j]);
				}
				System.out.println("");
			}
          
	}
}
}
	