package WWW;

public class Main {

	public static void main(String[] args) {
		int m,n;
		int sum;
		int judge=1;
		int count=0;
		for(m=201,n=m+1;m<760;n++)
		{
		 sum=m+n;
		 if(sum<1000)
			 continue;
		 if(n>879)
		 {
			 m++;
			 n=m+1;
		 }
		 int[] arr=new int[10];		 
         arr[0]=m/100;
         arr[1]=m/10%10;
         arr[2]=m%10;
         arr[3]=n/100;
         arr[4]=n/10%10;
         arr[5]=n%10;
         arr[6]=sum/1000;
         arr[7]=sum/100%10;
         arr[8]=sum%100/10;
         arr[9]=sum%10;
         int[] s=new int[10];
         for(int i=0;i<10;i++)
         {
        	 if(arr[i]>=10)
        	 {
        		 judge=0;
        		 break;
        	 }
        	 if(s[arr[i]]==1)
        	 {
        		 judge=0;
        		 break;
        	 }
        	 s[arr[i]]=1;
        	 judge=1;
         }
         if(judge==0)
        	 continue;
         else
         {
        	 count++;
        	 System.out.println(m+"+"+n+"="+sum);
         }
		}
		//System.out.println("");
		System.out.printf("Total of %d Expressions.\n", count);

	}

}