public interface AccountOperations {
    double checkBalance();
    void transfer(double amount, BankAccount bankAccount) throws AccountOperationException;
    void deposit(double amount) throws AccountOperationException;
}
