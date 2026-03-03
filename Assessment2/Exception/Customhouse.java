package Exception;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class Customhouse {
    static void check() throws MyException {
        throw new MyException("Custom Exception");
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}