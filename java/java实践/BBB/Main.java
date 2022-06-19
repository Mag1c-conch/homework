package BBB;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int m=in.nextInt();
			int n=in.nextInt();
			int[] arr=new int[100];
			int j=1;
			for(int i=0;i<m;i++)
			{
				arr[i]=1;
			}
			for(int i=0,x=m;i<m;i++)//j计数 i编号 x剩余人数
			{
				
				if(arr[i]==0&&i==m-1)
				{
						i=-1;
					continue;
				}
				if(arr[i]==0)
					continue;
				if(j==n)
				{
					x=x-1;
					j=0;
					arr[i]=0;
					//System.out.println(".....");
				}
				if(i==m-1)
					i=-1;
				if(x==1)
					//System.out.println("....");
                   break;
				j++;
			}
			
			for(int i=0;i<m;i++)
			{
				if(arr[i]==1)
				{
					System.out.printf("%d\n", i+1);
				}
			}
		}

	}

}
