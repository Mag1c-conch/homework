package sy41;

class People
{
   protected double weight,height;
   public void speakHello()
   {
       System.out.println("yayawawa");
   }  
  public void averageHeight()
   { 
      height=173;
      System.out.println("average height:"+height);
   }
  public void averageWeight()
   {
      weight=70;
      System.out.println("average weight:"+weight);
   }
}
class ChinaPeople extends People
{  
public void speakHello()
{
	System.out.println("����");//��дpublic void speakHello()������Ҫ��������ơ���ã�������������
}
          //������Ϣ

 public void averageHeight()
 {
	 height=168.78;
	 System.out.println("�й��˵�ƽ�����:"+height);//��дpublic void averageHeight()������Ҫ���������
 }
          //���й��˵�ƽ����ߣ�168.78���ס������ĺ�����Ϣ
public void averageWeight()
{
	weight=65;
	System.out.println("�й��˵�ƽ������:"+weight);//��дpublic void averageWeight()������
}
          //Ҫ��������ơ��й��˵�ƽ�����أ�65��������ĺ�����Ϣ
   public void chinaGongfu()
   {
     System.out.println("�й�����:������,վ����,˯�繭");//����й���������Ϣ�����磺"������,վ����,˯�繭"��
   }
}
class AmericanPeople  extends People
{
public void speakHello()
{
	System.out.println("How do you do?");//��дpublic void speakHello()������Ҫ���������
}
          //��How do you do��������Ӣ����Ϣ��
public void averageHeight()
{
	height=180;
	System.out.println("American average height:"+height);//��дpublic void averageHeight()����
}
    public void averageWeight()
    {
    	weight=70;
    	System.out.println("American average weight:"+weight);//��дpublic void averageWeight()����
    }
   public void americanBoxing()
   {
     System.out.println("ֱȭ");//���ȭ������Ϣ�����磬��ֱȭ��������ȭ����
   }
}
class BeijingPeople extends ChinaPeople 
{
	public void speakHello()
	{
		System.out.println("����");//��дpublic void speakHello()������Ҫ���������
	} //��дpublic void speakHello()������Ҫ��������ơ����á������ĺ�����Ϣ
	public void averageHeight()
	{
		height=173;
		System.out.println("�����˵�ƽ�����:"+height);//��дpublic void averageHeight()����
	} //��дpublic void averageHeight()����
	public void averageWeight()
    {
    	weight=70;
    	System.out.println("�����˵�ƽ������:"+weight);//��дpublic void averageWeight()����
    }//��дpublic void averageWeight()����
  public void beijingOpera() 
   {
      System.out.println("��������");//����������Ϣ
   }
}
public class Example
{
  public static void main(String args[])
  {
      ChinaPeople chinaPeople=new ChinaPeople();
      AmericanPeople americanPeople=new AmericanPeople();
      BeijingPeople beijingPeople=new BeijingPeople();
      chinaPeople.speakHello();
      americanPeople.speakHello();
      beijingPeople.speakHello();
      chinaPeople.averageHeight();
      americanPeople.averageHeight();
      beijingPeople.averageHeight();
      chinaPeople.averageWeight();
      americanPeople.averageWeight();
      beijingPeople.averageWeight();
      chinaPeople.chinaGongfu();
      americanPeople.americanBoxing();
      beijingPeople.beijingOpera() ;
      beijingPeople.chinaGongfu();
  }  
}
