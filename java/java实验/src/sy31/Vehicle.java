package sy31;

public  class  Vehicle{
      double speed;
      int power; //声明int类型变量power，刻画功率
     void  speedUp(int s){
speed +=s; //将参数s的值与成员变量speed的和赋值给成员变量speed
}
void  speedDown(int d){
speed-=d; //将成员变量speed与参数d的值的差赋值给成员变量speed
}
void  setPower(int p){
power = p; //将参数p的值赋值给成员变量power
}
int  getPower( ){
return power; //返回成员变量power的值
}
double getSpeed() {
return  speed;
}
}
