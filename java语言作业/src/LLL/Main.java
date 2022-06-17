package LLL;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		dianqi d=new dianqi();
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			d.no=in.nextInt();
			d.name=in.next();
			if(d.no==1)
				System.out.printf("%s is playing programs.\n", d.name);
			if(d.no==2)
				System.out.printf("%s is washing clothes.\n", d.name);
			if(d.no==3)
				System.out.printf("%s is cooling.\n", d.name);
			if(d.no==4)
				System.out.printf("%s is heating foods.\n", d.name);
		}
	}

}
class dianqi
{
public int no;

public String name;
}