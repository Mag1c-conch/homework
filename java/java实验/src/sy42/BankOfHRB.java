package sy42;

public class BankOfHRB extends Bank{
	  double year;
	  public double computerInterest(){
		super.year=(int)year;
		double r=year-(int)year;
		int day=(int)(r*1000);
		double yearInterest=super.computerInterest();//super�������ص�computerInterest����
		double dayInterest=day*0.00012*savedMoney;
		interest=yearInterest+dayInterest;
		System.out.printf("%dԪ���ڹ���������%d����%d�����Ϣ��%fԪ\n",savedMoney,super.year,day,interest);
		return interest;
		}
	}
