
class A {

    void run() {
        System.out.println("Running");
    }
}

class B extends A {

    void run() {
        System.out.println("Not Running");
        super.run();
    }
}

public class poly {

    public static void main(String[] args) {
        // B b=new B();
        A b = new B();
        b.run();
    }
}
