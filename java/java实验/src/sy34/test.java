package sy34;

public class test {

	public static void main(String[] args){
		CPU cpu=new CPU(); //创建一个CPU对象cpu
		cpu.setSpeed(2200);//cpu将自己的speed设置为2200
		
		HardDisk disk=new HardDisk();//创建一个HardDisk对象disk
		disk.setAmount(200);//disk将自己的amount设置为200 
		
		PC pc=new PC(); //创建一个PC对象pc
		
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
   	 System.out.println("cpu的速度："+cpu.getSpeed());
   	 System.out.println("硬盘的容量："+HD.getAmount());
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


