package sy32;

public class Family {
	  TV  homeTV;
	  void buyTV(TV tv){
		  this.homeTV=tv; //将参数tv赋值给homeTV
	  }
	  void remoteControl(int m){
		  homeTV.setChannel(m);  //homeTV调用TV类中方法设置频道
		 
	  }
		void seeTV(){
		 homeTV.showProgram();//homeTV调用TV类中方法显示频道节目
		}
	}

