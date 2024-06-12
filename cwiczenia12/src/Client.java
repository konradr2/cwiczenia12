import java.util.Random;

public class Client extends User{

    final int clientId;
    BankAccount account;
    public Client(String fname, String lname) {
        super(fname, lname);
        this.clientId = new Random().nextInt();
        this.account = new BankAccount();
    }

    public int getClientId() {
        return clientId;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", account=" + account +
                '}' + super.toString();
    }
}
