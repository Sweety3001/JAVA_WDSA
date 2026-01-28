abstract class A {
  abstract void engine();
  void mileage() {
    System.out.println("High Mileage");
  }
}

class B extends A {
  void engine() {
    System.out.println("Low Engine");
  }
  void sound() {
    System.out.println("Car soundddddddd");
  }
}

abstract class C extends B {
  void engine() {
    System.out.println("Heavy Engine");
  }
  void color() {
    System.out.println("Black");
  }
}

class D extends C {
  
}

public class Car {
  public static void main(String[] args) {
      A d = new D();
      d.mileage();
      d.engine();
      
  }
}
