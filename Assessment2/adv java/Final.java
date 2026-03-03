final class TestClass {
    final int x = 10;
    final void display() {
        System.out.println(x);
    }
}

public class Final {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
    }
}