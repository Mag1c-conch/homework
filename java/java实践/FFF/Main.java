package FFF;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    while(in.hasNext())
	    {
	    	String str1=in.next();
	    	String str2=in.next();
	    	int[] arr1=new int[26];
	    	for(int i=0;i<26;i++)
	    	{
	    		arr1[i]=0;
	    	}
	    	int[] arr2=new int[26];
	    	for(int i=0;i<26;i++)
	    	{
	    		arr2[i]=0;
	    	}
	    	if(str1.length()!=str2.length())
	    	{
	    		System.out.println("No");
	    	}
	    	else
	    	{
	    	  for(int i=0;i<str1.length();i++)
	    	  {
	    		
	    		arr1[str1.charAt(i)-'a']+=1;
	    		arr2[str2.charAt(i)-'a']+=1;
	    	  }
	    	  int judge=1;
	    	  for(int i=0;i<26;i++)
	    	  {
	    		  if(arr1[i]!=arr2[i])
	    		  {
	    			  judge=0;
	    			  System.out.println("No");
	    			  break;
	    		  }
	    	  }
	    	  if(judge==1)
	    		  System.out.println("Yes");
	    	}
	    }
	}
}
