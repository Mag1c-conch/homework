package HHH;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			double x1=in.nextDouble();
			double y1=in.nextDouble();
			double r1=in.nextDouble();
			double x2=in.nextDouble();
			double y2=in.nextDouble();
			double r2=in.nextDouble();
			double R=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			if(r1+r2==R)
				System.out.println("TANGENT");
			else if(r1+r2>R)
				System.out.println("INTERSECTION");
			else
				System.out.println("SEPARATION");
		}

	}

}
