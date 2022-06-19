package FFF;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(j<=i)
						System.out.printf("%3d",j);
					else
						System.out.printf("%3d",i);
				}
				System.out.println("");
			}
		}

	}

}
