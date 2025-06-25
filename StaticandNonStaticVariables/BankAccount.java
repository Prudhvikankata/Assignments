public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public void deposit(double amount) {
        double updatedBalance = balance + amount;
        balance = updatedBalance;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 123456;
        account.accountHolderName = "Prudhvi";
        account.balance = 10000;

        account.displayDetails();
        account.deposit(250.75);
    }
}
