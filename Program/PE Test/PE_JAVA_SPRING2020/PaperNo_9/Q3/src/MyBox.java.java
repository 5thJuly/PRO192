
import java.util.List;


public class MyBox implements IBox{

    @Override
    public void f1(List<Box> list) {
	//code start with k then increate price 10%
        
    }

    @Override
    public int f2(List<Box> list, double d) {
        //count box have price greater than given price
        return 0;
        //count box have price greater than given price
        
    }

    @Override
    // xóa box đứng sau box đầu tiên có giá trị bé nhất
    // nếu Box có giá trị thấp nhất ở vị trí cuối cùng thì ko remove
    public void f3(List<Box> list) {
        double min = list.get(0).getPrice();
        // Tìm giá trị bé nhất
        for (Box o : list) {
            if(o.getPrice() < min) {
                min = o.getPrice();
            }
            
        }
        for (int i = 0; i < list.size()-1; i++) { // min ở cuối thì bỏ qua
            // tìm gt = gt bé nhất rồi remove
            if(list.get(i).getPrice() == min) {
                
                list.remove(i+1) ; // xóa gt phía sau gt bé nhất
                break;
            }
            
        }
        
    }
    
}
