package sy32;

public class Family {
	  TV  homeTV;
	  void buyTV(TV tv){
		  this.homeTV=tv; //������tv��ֵ��homeTV
	  }
	  void remoteControl(int m){
		  homeTV.setChannel(m);  //homeTV����TV���з�������Ƶ��
		 
	  }
		void seeTV(){
		 homeTV.showProgram();//homeTV����TV���з�����ʾƵ����Ŀ
		}
	}

