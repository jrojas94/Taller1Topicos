import java.util.ArrayList;

public interface FacturaDao {

    public void addFactura(Factura factura);

    public void printFacturas();

    public void delFactura(int nroFactura);

    public void updateFactura(int nroFactura, Factura factura);

    public ArrayList<Factura> getFacturas();
}