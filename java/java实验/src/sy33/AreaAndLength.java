package sy33;
import static java.lang.Math.PI;
class Trangle  
{  
   double sideA,sideB,sideC,area,length;
   boolean boo;
   public  Trangle(double a,double b,double c) 
   { 
    this.sideA=a;
    this.sideB=b;
    this.sideC=c;//����a,b,c�ֱ�ֵ��sideA,sideB,sideC
     if(a+b>c&&b+c>a&&a+c>b) //a,b,c���������ε��������ʽ
     { 
       this.boo=true; //��boo��ֵ��
     }    
    else
     { 
        this.boo=false; //��boo��ֵ��
     }
   }
   double getLength() 
   {   
       if(boo)
       {
    	   return this.sideA+this.sideB+this.sideC;//�����壬Ҫ������length��ֵ������ 
       }
       else
       {
    	   System.out.println("����һ��������,���ܼ����ܳ�");
    	   return 0;
       }
  }
   public double  getArea() 
   {  
      if(boo)
        { 
          double p=(sideA+sideB+sideC)/2.0;
          area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
          return area;
        }
      else
        { 
          System.out.println("����һ��������,���ܼ������");
          return 0;
        }
   } 
   public void setABC(double a,double b,double c)
   { 
    this.sideA=a;
    this.sideB=b;
    this.sideC=c;//����a,b,c�ֱ�ֵ��sideA,sideB,sideC
     if(a+b>c&&b+c>a&&a+c>b) //a,b,c���������ε��������ʽ
     { 
       this.boo=true; //��boo��ֵ��
     }    
    else
     { 
        this.boo=false; //��boo��ֵ��
     }
   }
}
class Lader 
{   
    double above,bottom,height,area; 
    Lader(double a,double b,double c)
    {
      this.above=a;
      this.bottom=b;
      this.height=c;//�����壬������a,b,c�ֱ�ֵ��above,bottom,height
    }
    double getArea()
    {
      return (this.above+this.bottom)*this.height/2.0; //�����壬,Ҫ������area����
    }
}

class Circle 
{  
    double radius,area;
    Circle(double r)
    { 
        this.radius=r; //������
    }
    double getArea() 
    {  
       return PI*this.radius*this.radius; //�����壬Ҫ������area����
    }
    double getLength() 
    {  
      return 2.0*PI*this.radius*this.radius; //getArea������Ĵ���,Ҫ������length����
    }
    void setRadius(double newRadius)
    {  
       radius=newRadius;
    }
    double getRadius() 
    { 
        return radius;
    }
}
public class AreaAndLength 
{  
    public static void main(String args[])
    { 
       double length,area;
       Circle circle=new Circle(3); //��������circle
       Trangle trangle=new Trangle(3,4,5); //��������trangle��
       Lader lader = new Lader(2,3,4); //��������lader
       length=circle.getLength(); // circle���÷��������ܳ�����ֵ��length
        System.out.println("Բ���ܳ�:"+length); 
       area=circle.getArea(); // circle���÷��������������ֵ��area
        System.out.println("Բ�����:"+area); 
       length=trangle.getLength(); // trangle���÷��������ܳ�����ֵ��length
        System.out.println("�����ε��ܳ�:"+length); 
       area=trangle.getArea(); // trangle���÷��������������ֵ��area
        System.out.println("�����ε����:"+area); 
       area=lader.getArea(); // lader���÷��������������ֵ��area
        System.out.println("���ε����:"+area); 
       trangle.setABC(12, 34, 1); // trangle���÷������������ߣ�Ҫ���������޸�Ϊ12,34,1��
       area=trangle.getArea(); // trangle���÷��������������ֵ��area
        System.out.println("�����ε����:"+area); 
       length=trangle.getLength(); // trangle���÷��������ܳ�����ֵ��length
        System.out.println("�����ε��ܳ�:"+length);
        circle.setRadius(3);
        System.out.println("�޸ĺ�İ뾶Ϊ"+circle.getRadius());
        System.out.println("�޸ĺ�����Ϊ"+circle.getArea());
        System.out.println("�޸ĺ���ܳ�Ϊ"+circle.getLength());
    }
}
