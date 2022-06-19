package CCC;
//平面上有4种图形：点、线段、圆和三角形。
//给定点的坐标、线段两个端点的坐标、圆的圆心坐标和三角形三个顶点的坐标，根据要求对4种图形进行平移变换和旋转变换。
import java.util.Scanner;


class dian{           //点类
	double x1,y1,x2,y2,x3,y3,jiao;
	double xx1,yy1;  
	int n;
	double r;
	public void py(double x,double y)
	{
			x1=x+x1;
			y1=y+y1;
			x2=x+x2;
			y2=y2+y;			
			x3+=x;
			y3+=y;
		
    }

	public void xz(double x,double y,double jiao)
	{
		xx1=x1;
		yy1=y1;
		x1 = (x1-x)*Math.cos(jiao/180*Math.PI) - (y1-y)*Math.sin(jiao/180*Math.PI) + x; 
		y1 = (xx1-x)*Math.sin(jiao/180*Math.PI) + (yy1-y)*Math.cos(jiao/180*Math.PI) + y;	
            xx1=x2;
            yy1=y2;
			x2= (x2-x)*Math.cos(jiao/180*Math.PI) - (y2-y)*Math.sin(jiao/180*Math.PI) + x; 
			y2 = (xx1-x)*Math.sin(jiao/180*Math.PI) + (yy1-y)*Math.cos(jiao/180*Math.PI) + y;				
            xx1=x3;
            yy1=y3;
			x3 = (x3-x)*Math.cos(jiao/180*Math.PI) - (y3-y)*Math.sin(jiao/180*Math.PI) + x; 
			y3 = (xx1-x)*Math.sin(jiao/180*Math.PI) + (yy1-y)*Math.cos(jiao/180*Math.PI) + y;
			
		
	
}
}
class xd extends dian{             //线段类

}


class yuan extends dian{           //圆类
	double r;       //半径
}


class sjx extends dian{                         //三角形类

}


public  class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(in.hasNext())
		{
			dian d=new dian();
			int p;
			double x,y,jiao = 0;
			switch(in.nextInt())
			{
			case 1:
				d.x1=in.nextDouble();
				d.y1=in.nextDouble();
				p=in.nextInt();
				x=in.nextDouble();
				y=in.nextDouble();
				if(p==1)
				{		
					d.py(x,y);
					System.out.printf("(%.2f,%.2f)\n", d.x1,d.y1);
				}
				if(p==2)
				{
					jiao=in.nextDouble();
					d.xz(x,y,jiao);
					System.out.printf("(%.2f,%.2f)\n", d.x1,d.y1);
				}
				break;
			case 2:
				xd xd=new xd();
				xd.x1=in.nextDouble();
				xd.y1=in.nextDouble();
				xd.x2=in.nextDouble();
				xd.y2=in.nextDouble();
				p=in.nextInt();
				x=in.nextDouble();
				y=in.nextDouble();
				if(p==1)
				{
					xd.py(x, y);
					System.out.printf("(%.2f,%.2f)-(%.2f,%.2f)\n", xd.x1,xd.y1,xd.x2,xd.y2);
				}
				if(p==2)
				{
					xd.xz(x,y,jiao);
					System.out.printf("(%.2f,%.2f)-(%.2f,%.2f)\n", xd.x1,xd.y1,xd.x2,xd.y2);

				}
				break;
			case 3:			
				d.x1=in.nextDouble();
				d.y1=in.nextDouble();
				d.r=in.nextDouble();
				p=in.nextInt();
				x=in.nextDouble();
				y=in.nextDouble();
				if(p==1)
				{		
					d.py(x,y);
					System.out.printf("(%.2f,%.2f)Radius:%.2f\n", d.x1,d.y1,d.r);
				}
				if(p==2)
				{
					jiao=in.nextDouble();
					d.xz(x,y,jiao);
					System.out.printf("(%.2f,%.2f)Radius:%.2f\n", d.x1,d.y1,d.r);
				}
				break;
			case 4:
				sjx sjx=new sjx();
				sjx.x1=in.nextDouble();
				sjx.y1=in.nextDouble();
				sjx.x2=in.nextDouble();
				sjx.y2=in.nextDouble();
				sjx.x3=in.nextDouble();
				sjx.y3=in.nextDouble();
				p=in.nextInt();
				x=in.nextDouble();
				y=in.nextDouble();
				if(p==1)
				{		
					sjx.py(x, y);
					System.out.printf("(%.2f,%.2f)-(%.2f,%.2f)-(%.2f,%.2f)",sjx.x1,sjx.y1,sjx.x2,sjx.y2,sjx.x3,sjx.y3);
				}
				if(p==2)
				{
					jiao=in.nextDouble();
					sjx.xz(x,y,jiao);
					System.out.printf("(%.2f,%.2f)-(%.2f,%.2f)-(%.2f,%.2f)\n",sjx.x1,sjx.y1,sjx.x2,sjx.y2,sjx.x3,sjx.y3);
				}
				break;
			default:
				return;
			}
		}

	}

}
