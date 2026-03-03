package ObjectOriented;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println(acc.getBalance());
    }
}