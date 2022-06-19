package sy34;

public class test {

	public static void main(String[] args){
		CPU cpu=new CPU(); //����һ��CPU����cpu
		cpu.setSpeed(2200);//cpu���Լ���speed����Ϊ2200
		
		HardDisk disk=new HardDisk();//����һ��HardDisk����disk
		disk.setAmount(200);//disk���Լ���amount����Ϊ200 
		
		PC pc=new PC(); //����һ��PC����pc
		
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
		
	}
	
}
class PC {
    CPU cpu;
    HardDisk HD;
    
    public void setCPU(CPU c){
   	 this.cpu=c;
    }
    
    public void setHardDisk(HardDisk h){
   	 this.HD=h; 
    }
    
    public void show(){
   	 System.out.println("cpu���ٶȣ�"+cpu.getSpeed());
   	 System.out.println("Ӳ�̵�������"+HD.getAmount());
    }
}
	class HardDisk {
    int amount;
    
    int getAmount(){
   	 return amount;
    }
    
    void setAmount(int m){
   	 this.amount=m;
    }
}
   class CPU {
    int speed;
    
    int getSpeed(){
  	  return speed;
    }
    
    void setSpeed(int m){
  	  this.speed=m;
    }
    
}


