package sy31;

public  class  Vehicle{
      double speed;
      int power; //����int���ͱ���power���̻�����
     void  speedUp(int s){
speed +=s; //������s��ֵ���Ա����speed�ĺ͸�ֵ����Ա����speed
}
void  speedDown(int d){
speed-=d; //����Ա����speed�����d��ֵ�Ĳֵ����Ա����speed
}
void  setPower(int p){
power = p; //������p��ֵ��ֵ����Ա����power
}
int  getPower( ){
return power; //���س�Ա����power��ֵ
}
double getSpeed() {
return  speed;
}
}
