package GGG;
import java.util.*;
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
			if(v>0)
			    System.out.printf("%.2f+%.2fi",r,v );
			else if(v==0)
				System.out.printf("%.2f",r);
			else
				System.out.printf("%.2f%.2fi",r,v);
			System.out.print(",");
			r=x1-x2;
			v=y1-y2;
			if(v>0)
			    System.out.printf("%.2f+%.2fi",r,v );
			else if(v==0)
				System.out.printf("%.2f",r);
			else
				System.out.printf("%.2f%.2fi",r,v);
			System.out.print(",");
			r=x1*x2-y1*y2;
			v=x1*y2+x2*y1;
			if(v>0)
			    System.out.printf("%.2f+%.2fi",r,v );
			else if(v==0)
				System.out.printf("%.2f",r);
			else
				System.out.printf("%.2f%.2fi",r,v);
			System.out.print(",");
			double t=x2*x2+y2*y2;
			y2*=-1;
			r=(x1*x2-y1*y2)/t;
			v=(x1*y2+x2*y1)/t;
			if(v>0)
			    System.out.printf("%.2f+%.2fi",r,v );
			else if(v==0)
				System.out.printf("%.2f",r);
			else
				System.out.printf("%.2f%.2fi",r,v);
			System.out.println("");
		}

	}

}
