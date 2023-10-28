
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> list) {
        int count = 0;
        for (Cala o : list) {
            if(Character.isDigit(o.getOwner().charAt(1))) { //vi tri thu 2 la so thi in ra mh
                count++ ;
            }
            
        }
        return count ;  
    }

    @Override
    public void f2(List<Cala> list) {
        int max = list.get(0).getPrice();
        int position = 0; // vi tri
        int count = 0;
        // tim gia tri Price max
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() > max) {
                max = list.get(i).getPrice();
            }
            
        }
        // kiem tra co bao nhieu gt max
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() == max) {
                count++ ;
                if(count == 2) { // tim vi tri max thu 2 
                    position = i;
                    list.remove(list.get(position)) ; // xoa vi tri thu 2
                }
            }
            
        }
    }

    @Override
    public void f3(List<Cala> list) {
        Collections.sort(list, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                // tra ve gia tri sap xep theo thu tu tang dan ki tu thu 2
                return o1.getOwner().charAt(1) - o2.getOwner().charAt(1);
            }
        });
        
    }
}
    

