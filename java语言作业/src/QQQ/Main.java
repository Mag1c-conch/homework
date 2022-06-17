package QQQ;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
        String str=sc.nextLine();
        int[] word=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')
            {
                int num=word[c-'a'];
                num++;
                word[c-'a']=num;
            }
            if(c>='A'&&c<='Z')
            {
            	int num=word[c-'A'];
                num++;
                word[c-'A']=num;
            }
        }
        for(int j=0;j<26;j++)
        {
            if(word[j]>=0)
            {
                System.out.printf("%3d",word[j]);
            }
        }
        System.out.println("");
    }
    }
}
