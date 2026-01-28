
interface A {

    void methodA();
}

interface B {

    void methodA();

    default void methodB() {
        System.out.println("This is a default method in interface B");
    }
}

class C implements A, B {

    public void methodA() {
        System.out.println("Implementation of methodA from interface A");
    }

    public void methodB() {
        System.out.println("Implementation of methodB from interface B");
        B.super.methodB();
    }

}

public class ExampleInterfc2 {

    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
    }
}
