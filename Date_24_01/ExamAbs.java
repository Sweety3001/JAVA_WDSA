abstract class Animal{
  abstract void sound();
  void eat(){
    System.out.println("Eating");
  }
}
class Bird extends Animal{
  void sound(){
    System.out.println("Chirping");
  }
  
}
public class ExamAbs {
  public static void main(String[] args) {
    Animal a=new Bird();
    a.sound();
  }
}
