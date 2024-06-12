import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountOperations{

    double balance;
    List<String> transactions;
    public BankAccount(){
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void transfer(double amount, BankAccount bankAccount) throws AccountOperationException {
        if (amount <= 0){
            throw new AccountOperationException("trasfer amount must be positive");
        }
        if (amount > this.balance){
            throw new AccountOperationException("Insufficient funds for the transfer");
        }
        this.balance -= amount;
        bankAccount.deposit(amount);
        Transaction transaction = new Transaction(amount, this, bankAccount);
        this.transactions.add(String.valueOf(transaction));
        //this.transactions.add("transferred " + amount + " to "+ bankAccount.hashCode());

        bankAccount.getTransactions().add(String.valueOf(transaction));

    }

    @Override
    public void deposit(double amount) throws AccountOperationException {
        if(amount <= 0){
            throw new AccountOperationException("deposit amount must be positive");}

            this.balance += amount;
            this.transactions.add("Deposited " + amount);

    }

    public List<String> getTransactions(){
        return this.transactions;
    }
}
