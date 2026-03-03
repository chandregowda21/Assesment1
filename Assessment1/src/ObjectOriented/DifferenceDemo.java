package ObjectOriented;

class Parent {
    void show() {
        System.out.println("Parent method");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("Child method");
    }
    int show(int a) {
        return a;
    }
}
public class DifferenceDemo {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        Child c = new Child();
        System.out.println(c.show(10));
    }
}