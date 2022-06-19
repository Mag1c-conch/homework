package EEE;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			int n=input.nextInt();      //数组元素个数
			int[] a=new int[100];
			for(int i=0;i<n;i++)
			{
			    a[i]=input.nextInt();   //输入数组
			}
			int c=input.nextInt();
			if(c==1)                    //输入1插入
			{
				int x=input.nextInt();  //插入位置
				int m=input.nextInt();  //插入元素
				for(int i=n-1;i>=x;i--)
				{
					if(i==x)
					{
						a[i+1]=a[i];
						a[i]=m;
					}
					else
						a[i+1]=a[i];
				}
				for(int i=0;i<=n;i++)
				{
					System.out.print(a[i]);
					if(i<n)
						System.out.print(" ");
					else
						System.out.println("");
				}
			}
			if(c==2)                    //输入2删除
			{
				int x=input.nextInt();
				for(int i=x+1;i<=n-1;i++)
				{
					if(i!=n-1)
						a[i-1]=a[i];
					else
					{
						a[i-1]=a[i];
						a[i]=0;
					}
				}
				for(int i=0;i<n-1;i++)
				{
					System.out.print(a[i]);
					if(i<n-2)
						System.out.print(" ");
					else
						System.out.println("");
				}
			}
		}

	}

}
