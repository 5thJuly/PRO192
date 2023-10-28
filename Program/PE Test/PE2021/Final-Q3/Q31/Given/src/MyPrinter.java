
import java.util.List;


/**
 *
 * @author alias
 */
public class MyPrinter implements IPrinter{

    @Override
    public void f1(List<Printer> a, double price) {
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() <= price){
                a.remove(i);
                i--;
            }
        }
    }


    // Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này. 
    // Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, 
    // nếu không trả về false.
    @Override
    public int f2(List<Printer> a, String name) {
        int count = 0;
        for (Printer o : a) {
            if(o.getName().toUpperCase().contains(name.toUpperCase())){
        // cho name của printer UpperCase và tên người dùng nhập Uppercase 
        // người dùng nhập thế nào cũng đúng 
                count++;
            }
        }
        return count;
        
    }

    
    
}
