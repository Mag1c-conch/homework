package III;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			Double x0 = null;
			Double y0 = null;
			Double x1=in.nextDouble();
			Double y1=in.nextDouble();
			int c=in.nextInt();
			if(c==1)
			{
				Double x=in.nextDouble();
				Double y=in.nextDouble();
				x0=x+x1;
				y0=y+y1;
			}
			if(c==2)
			{
				Double x=in.nextDouble();
				Double y=in.nextDouble();
				Double t=in.nextDouble();
			    x0=(x1-x)*Math.cos(Math.PI/180*t)-(y1-y)*Math.sin(Math.PI/180*t)+x;
				y0=(x1-x)*Math.sin(Math.PI/180*t)+(y1-y)*Math.cos(Math.PI/180*t)+y;
			}
			System.out.printf("(%.2f,%.2f)",x0,y0);
			System.out.println("");
		}
		

	}

}
