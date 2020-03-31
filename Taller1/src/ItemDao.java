import java.util.ArrayList;

public interface ItemDao {

    public void addItem(Item items);

    public void printItem();

    public void delItem(int idItem);

    public void updateItem(int idItem, Item items);

    public ArrayList<Item> getItems();
}