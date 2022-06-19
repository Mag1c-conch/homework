package sy43;

abstract class Employee{
	public abstract double earnings();
}
class YearWorker extends Employee{
	public double earnings()
	{
		return 60000;//重写earnings（）方法
	}
}
class MonthWorker extends Employee{
	public double earnings()
	{
		return 50076;//重写earnings（）方法
	} //重写earnings（）方法	}
}
class WeekWorker extends Employee{
	public double earnings()
	{
		return 16500;//重写earnings（）方法
	} //重写earnings（）方法	}
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
			salaries+=this.employee[i].earnings();//计算salaries
		}
		return salaries;
	}
}
public class CompanySalary {
  public static void main(String arg[]){
	  Employee[] employee=new Employee[29]; //公司有29名雇员
	  for(int i=0;i<employee.length;i++){      //雇员分成三类
		  if(i%3==0)
			  employee[i]=new WeekWorker();
		  if(i%3==1)
			  employee[i]=new MonthWorker(); 
		  if(i%3==2)
			  employee[i]=new YearWorker();
	  }
	  Company company=new Company(employee);
	  System.out.println("公司薪水总额："+company.salaiesPay()+"元");
  }
}
