import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Employee extends User{

    final int employeeId;
    List<Client> clients;
    public Employee(String fname, String lname) {
        super(fname, lname);
        this.employeeId = new Random().nextInt();
        this.clients = new ArrayList<>();

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public List<Client> getClients() {
        return clients;
    }

    public Client addClient(Client client, String lname){
        Client client1 = new Client(fname, lname);
        clients.add(client1);
        return client1;
    }
}
