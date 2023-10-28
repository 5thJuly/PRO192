
import java.util.ArrayList;

public class ItemList extends ArrayList<Item>{
    
//    private ItemList list = new ArrayList<>();
    
    public void addItem(Item item){
        this.add(item);
    }
    
    public void printFirstItem(){
        Item i = this.get(0);
        System.out.println(i.toString());
    }
    
    public int getTotalQuantity(){
        int total = 0;
        for (Item item : this) {
            total += item.getQuantity();
        }
        return total;
    }
}
