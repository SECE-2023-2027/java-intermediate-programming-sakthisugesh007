import java.util.Scanner;

public class Main {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Main(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
            return;
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String holderName = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        Main account = new Main(accountNumber, holderName, balance);
        account.deposit(depositAmount);
        account.withdraw(withdrawalAmount);
        System.out.println(account.getBalance());
        scanner.close();
    }
}