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
    this.sideC=c;//参数a,b,c分别赋值给sideA,sideB,sideC
     if(a+b>c&&b+c>a&&a+c>b) //a,b,c构成三角形的条件表达式
     { 
       this.boo=true; //给boo赋值。
     }    
    else
     { 
        this.boo=false; //给boo赋值。
     }
   }
   double getLength() 
   {   
       if(boo)
       {
    	   return this.sideA+this.sideB+this.sideC;//方法体，要求计算出length的值并返回 
       }
       else
       {
    	   System.out.println("不是一个三角形,不能计算周长");
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
          System.out.println("不是一个三角形,不能计算面积");
          return 0;
        }
   } 
   public void setABC(double a,double b,double c)
   { 
    this.sideA=a;
    this.sideB=b;
    this.sideC=c;//参数a,b,c分别赋值给sideA,sideB,sideC
     if(a+b>c&&b+c>a&&a+c>b) //a,b,c构成三角形的条件表达式
     { 
       this.boo=true; //给boo赋值。
     }    
    else
     { 
        this.boo=false; //给boo赋值。
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
      this.height=c;//方法体，将参数a,b,c分别赋值给above,bottom,height
    }
    double getArea()
    {
      return (this.above+this.bottom)*this.height/2.0; //方法体，,要求计算出area返回
    }
}

class Circle 
{  
    double radius,area;
    Circle(double r)
    { 
        this.radius=r; //方法体
    }
    double getArea() 
    {  
       return PI*this.radius*this.radius; //方法体，要求计算出area返回
    }
    double getLength() 
    {  
      return 2.0*PI*this.radius*this.radius; //getArea方法体的代码,要求计算出length返回
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
       Circle circle=new Circle(3); //创建对象circle
       Trangle trangle=new Trangle(3,4,5); //创建对象trangle。
       Lader lader = new Lader(2,3,4); //创建对象lader
       length=circle.getLength(); // circle调用方法返回周长并赋值给length
        System.out.println("圆的周长:"+length); 
       area=circle.getArea(); // circle调用方法返回面积并赋值给area
        System.out.println("圆的面积:"+area); 
       length=trangle.getLength(); // trangle调用方法返回周长并赋值给length
        System.out.println("三角形的周长:"+length); 
       area=trangle.getArea(); // trangle调用方法返回面积并赋值给area
        System.out.println("三角形的面积:"+area); 
       area=lader.getArea(); // lader调用方法返回面积并赋值给area
        System.out.println("梯形的面积:"+area); 
       trangle.setABC(12, 34, 1); // trangle调用方法设置三个边，要求将三个边修改为12,34,1。
       area=trangle.getArea(); // trangle调用方法返回面积并赋值给area
        System.out.println("三角形的面积:"+area); 
       length=trangle.getLength(); // trangle调用方法返回周长并赋值给length
        System.out.println("三角形的周长:"+length);
        circle.setRadius(3);
        System.out.println("修改后的半径为"+circle.getRadius());
        System.out.println("修改后的面积为"+circle.getArea());
        System.out.println("修改后的周长为"+circle.getLength());
    }
}
