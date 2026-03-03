package Exception;

public class Validexce {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        validate(12);
    }
}