package OOO;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			double x1=in.nextDouble();
			double y1=in.nextDouble();
			double x2=in.nextDouble();
			double y2=in.nextDouble();
			double r=0,v=0;
			r=x1+x2;
			v=y1+y2;
			    System.out.printf("(%.2f,%.2f)",r,v );
			r=x1-x2;
			v=y1-y2;
			    System.out.printf("(%.2f,%.2f)",r,v );

			r=x1*x2-y1*y2;
			v=x1*y2+x2*y1;
			    System.out.printf("(%.2f,%.2f)",r,v );
			double t=x2*x2+y2*y2;
			y2*=-1;
			r=(x1*x2-y1*y2)/t;
			v=(x1*y2+x2*y1)/t;
			if(x2==0&&y2==0)
				System.out.printf("divied by 0!",r,v);
			else
			    System.out.printf("(%.2f,%.2f)",r,v );
			//else
				//System.out.printf("divied by 0!",r,v);
			System.out.println("");
		}

	}

}
