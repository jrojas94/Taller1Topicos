import java.util.ArrayList;

public interface ClienteDao {

    public void addCliente(Cliente cliente);

    public void printClientes();

    public void delCliente(int idCliente);

    public void updateCliente(int idCliente, Cliente cliente);

    public ArrayList<Cliente> getClientes();
}