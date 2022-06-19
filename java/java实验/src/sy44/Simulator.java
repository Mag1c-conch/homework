package sy44;
public class Simulator {
  public void playSound(Animal animal) {
  animal.cry();
  }
     public  static void main(String args[]) {
  Simulator simultaor = new Simulator();
  simultaor.playSound(new Dog());
  simultaor.playSound(new Cat());
 }
}
class Cat extends Animal{
	 void cry() {
	  System.out.println("ß÷ß÷ß÷");
	  }
	  String getAnimalName() {
	  return "Cat";
	  }
	  }
class Dog extends Animal{
    void cry() {
     System.out.println("ÍôÍôÍô");
    }
String getAnimalName() {
return "Dog";
}
}
abstract class Animal {
    abstract void cry();
    abstract String getAnimalName();
}
