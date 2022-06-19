package sy43;

abstract class Employee{
	public abstract double earnings();
}
class YearWorker extends Employee{
	public double earnings()
	{
		return 60000;//��дearnings��������
	}
}
class MonthWorker extends Employee{
	public double earnings()
	{
		return 50076;//��дearnings��������
	} //��дearnings��������	}
}
class WeekWorker extends Employee{
	public double earnings()
	{
		return 16500;//��дearnings��������
	} //��дearnings��������	}
}

class Company{
	Employee[] employee;
	double salaries=0;
	Company(Employee[] employee){
		this.employee=employee;
	}
	public double salaiesPay(){
		salaries=0;
		for(int i=0;i<employee.length; i++)
		{
			salaries+=this.employee[i].earnings();//����salaries
		}
		return salaries;
	}
}
public class CompanySalary {
  public static void main(String arg[]){
	  Employee[] employee=new Employee[29]; //��˾��29����Ա
	  for(int i=0;i<employee.length;i++){      //��Ա�ֳ�����
		  if(i%3==0)
			  employee[i]=new WeekWorker();
		  if(i%3==1)
			  employee[i]=new MonthWorker(); 
		  if(i%3==2)
			  employee[i]=new YearWorker();
	  }
	  Company company=new Company(employee);
	  System.out.println("��˾нˮ�ܶ"+company.salaiesPay()+"Ԫ");
  }
}
