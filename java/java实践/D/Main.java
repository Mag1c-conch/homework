package D;

import java.util.Scanner;

abstract class shape{
      abstract public double getarea();
}

class circle extends shape{
	double r;
	
	@Override
	public double getarea() {
		
		return Math.PI * Math.pow(this.r, 2);
	}

}

class triangle extends shape{

	double a,b,c;
	@Override
	public double getarea() {
	if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	else return 0;
	
}
}

class rectangle extends shape{

	double a, b;

	@Override
	public double getarea() {
		return a * b;
	}


}
	
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double s;
		while(in.hasNext())
		{
			switch(in.nextInt())
			{
			case 0:
				circle o=new circle();
				o.r=in.nextDouble();
				s=o.getarea();
				break;
			case 1:
				triangle t=new triangle();
				t.a=in.nextDouble();
				t.b=in.nextDouble();
				t.c=in.nextDouble();
				s=t.getarea();
				break;
			case 2:
				rectangle j=new rectangle();
				j.a=in.nextDouble();
				j.b=in.nextDouble();
				s=j.getarea();
				break;
			default:
				return;
			}
			double h=in.nextDouble();
			double p=s*h;
			System.out.printf("%.2f\n", p);
		}

	}

}

