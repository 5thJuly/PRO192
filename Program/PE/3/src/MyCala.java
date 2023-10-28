
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCala implements ICala {

    @Override
    // Đếm và trả về số phần tử với owner có kí tự thứ 2 là chữ
    public int f1(List<Cala> t) {
        int number = 0;
        for (Cala cala : t) {
            if (Character.isLetter(cala.getOwner().charAt(1))) {
                number++;
            }
        }
        return number;
    }

    @Override
    // xóa kí tự nhỏ thứ 2
    public void f2(List<Cala> t) {
        int i = 0;
        int min = t.get(0).getPrice();

        int count = 0;
        // hàm tìm kí tự nhỏ nhất
        for (i = 1; i < t.size(); i++) {
            if (t.get(i).getPrice() < min) {
                min = t.get(i).getPrice();
            }
        }
        // hàm tìm giá trị nhỏ thứ 2 trong mảng
        for (i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() == min) {
                count++;
            }
            if (count == 2) {
                t.remove(i);
                break;
            }
        }
    }

    @Override
    public void f3(List<Cala> t) {
    //    Comparator com = new Comparator<Cala>() {
    //        @Override
    //        public int compare(Cala o1, Cala o2) {
    //            if(o2.getOwner().length()>=2 && o1.getOwner().length()>=2){
    //                return o1.getOwner().charAt(1)-o2.getOwner().charAt(1);
    //            }
    //            return Integer.MAX_VALUE;    
    //        }
    //    }; 
    //    Collections.sort(t,com);
        Collections.sort(t, new Comparator<Cala>() {

            @Override
            public int compare(Cala o1, Cala o2) {
                
                return o2.getOwner().charAt(1) - o1.getOwner().charAt(1);
            }
            
        });

    }
    

}
