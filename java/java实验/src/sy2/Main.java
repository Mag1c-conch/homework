package sy2;

public class Main {

	public static void main(String[] args) {
		int startPosition=0,endPosition=0;
		char cStart='A',cEnd='Z';
		startPosition=(int)cStart;
		endPosition=(int)cEnd;
		System.out.println("Ӣ����ĸ����Unicode���е�λ�ã�"+startPosition);
		System.out.println("Ӣ����ĸ��");
		for(int i=startPosition;i<=endPosition;i++){
		char c='\0';
		c=(char)i;
		System.out.print(" "+c);
		if((i-startPosition+1)%10==0)
		System.out.println(" ");
		}
	}

}
