
import java.util.List;


public class MyBicycle implements IBicycle{

    @Override
    public void f1(List<Bicycle> list) {
        //b1 : tim duoc price thap nhat 
        float min = 110;
        for (Bicycle o : list) {
            if(o.getPrice() < min) {
                min = o.getPrice();
            }
            
        }
        // xoa gia tri nho nhat tim duoc dau tien
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() == min) { 
                list.remove(i) ;
                break;
            }
            
        }
    }

    @Override
    public int f2(List<Bicycle> list, String string) {
        // upper string, upper bicycle name
        int count = 0;
        String txt = string.toUpperCase();
        for (Bicycle o : list) {
            if(o.getName().toUpperCase().endsWith(txt)) {
                count++ ;
            }
            
        }
        return count;
    }
    
    

	
}
