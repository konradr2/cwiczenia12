
public class Main {
    public static void main(String[] args) {

        try {
            BankAccount account1 = new BankAccount();
            BankAccount account2 = new BankAccount();


            account1.deposit(1000);
            System.out.println("Account1 balance: "+ account1.checkBalance());
            account1.transfer(200,account2);
            System.out.println("Account1 balance after transfer: "+ account1.checkBalance());
            System.out.println("Account2 balance after transfer: "+ account2.checkBalance());

            System.out.println("Account1 transactions: "+ account1.getTransactions());
            System.out.println("Account2 transactions: "+ account2.getTransactions());





        }catch (AccountOperationException e){
            System.err.println("Operation failed: " + e.getMessage());
        }
    }
}