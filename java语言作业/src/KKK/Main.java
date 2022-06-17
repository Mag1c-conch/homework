package KKK;

import java.util.Scanner;

class Student {
public long sfz;
	
public String sNo; //学号

public String name; //姓名

public String sex; //性别

public String pro;  //专业

public int ying;    //英语

public int shu;   //数学

public int java;   //java

public int age;   //年龄


}
class Teacher {
public long sfz;
	
public String sNo; //学号

public String name; //姓名

public String sex; //性别

public String pro;  //专业

public String zhi;   

public int time;

public int age;   //年龄


}
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Student s=new Student();
		Teacher t=new Teacher();
		while(in.hasNext())
		{
			int x=in.nextInt();
			if(x==1)
			{
			s.sfz=in.nextLong();
			s.sNo=in.next();
			s.name=in.next();
			s.sex=in.next();
			s.age=in.nextInt();
			s.pro=in.next();
			s.shu=in.nextInt();
			s.ying=in.nextInt();
			s.java=in.nextInt();
			System.out.printf("Student:%d %s %s %s %d %s %d %d %d\n",s.sfz,s.sNo,s.name,s.sex,s.age,s.pro,s.shu,s.ying,s.java);
		    }
			if(x==2)
			{
				t.sfz=in.nextLong();
			    t.sNo=in.next();
				t.name=in.next();
				t.sex=in.next();
				t.age=in.nextInt();
				t.pro=in.next();
				t.zhi=in.next();
				t.time=in.nextInt();
				System.out.printf("Teacher:%d %s %s %s %d %s %s %d\n",t.sfz,t.sNo,t.name,t.sex,t.age,t.pro,t.zhi,t.time);
			}
	    }
    }
}