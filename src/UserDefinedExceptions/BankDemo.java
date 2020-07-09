package UserDefinedExceptions;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        account.deposit(500.00);

        try {
            System.out.println("\nWithdrawing $100...");
            account.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            account.withdraw(600.00);
        }catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}