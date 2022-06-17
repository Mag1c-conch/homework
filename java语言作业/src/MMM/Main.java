package MMM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String str1="Student";
			String str2="Bird";
			String str3="Car";
			String name=in.next();
			if(name.equals(str1))
				A.student();
			if(name.equals(str2))
				A.bird();
			if(name.equals(str3))
				A.car();
		}

	}
}
interface A
{
	public static void bird()
	{
		System.out.println("The bird is flying in air!");
	}
	public static void student()
	{
		System.out.println("The student is studying!");
	}
	public static void car()
	{
		System.out.println("The car is running on the road!");
	}
}