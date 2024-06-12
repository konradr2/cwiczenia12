public class Transaction {
    double amount;
    BankAccount fromAccount;
    BankAccount toAccount;


    public Transaction(double amount, BankAccount fromAccount, BankAccount toAccount){
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getFromAccount() {
        return fromAccount;
    }

    public BankAccount getToAccount() {
        return toAccount;
    }

    @Override
    public String toString() {
        return "Transactions: amount= " + amount + " from account= "+ fromAccount.hashCode() +" to account= " + toAccount.hashCode();
    }
}

