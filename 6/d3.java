class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Not Sufficient Fund");
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialAmount) {
        balance = initialAmount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }
}

public class d3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        System.out.println("Initial Balance: " + account.checkBalance());

        try {
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.checkBalance());
    }
}
/*
o/p 
Initial Balance: 1000.0
Exception caught: Not Sufficient Fund
Final Balance: 300.0
 */