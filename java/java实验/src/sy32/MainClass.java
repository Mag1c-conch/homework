package sy32;

public class MainClass {
	   public static void main(String args[]){
		   TV haierTV=new TV();
		   haierTV.setChannel(5); //haierTV����setChannel(int m),�������m����5
		   System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
		   Family zhangsanFamily=new Family();
		   zhangsanFamily.buyTV(haierTV);//zhangsanFamily����void buyTV(TV tv)����������haierTV���ݸ�����TV
		   System.out.println("zhangsanFamily��ʼ�����ӽ�Ŀ");
		   zhangsanFamily.seeTV();
		   int m=2;
		   System.out.println("zhangsanFamily�����Ӹ���Ϊ"+m+"Ƶ��");
		   zhangsanFamily.remoteControl(m);
		   System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
		   System.out.println("zhangsanFamily�ٿ����ӽ�Ŀ");
		   zhangsanFamily.seeTV();
	   }
	}
