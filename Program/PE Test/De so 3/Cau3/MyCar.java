import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCar /*implements ICar*/ {

   // @Override
   // trả lại toàn bộ rate trung bình của tất cả ô tô 
   // (ví dụ: toàn bộ phần của 3,7 là 3)
    public int f1(List<Car> t) {
        double average = 0;
        int carCount = t.size(); // bằng sô lượng
        for (int i = 0; i < carCount; i++) {
            average += t.get(i).getRate(); // sum = sum cũ + giá trị get(i) hiện tại
        }
        return (int) average / carCount;

        // TEST CASE : 
        // Add how many elements : 0
        // Enter TC (1-f1;2-f2;3-f3) : 1
        // The list before running f1 : 
        // (A,3) (B,7) (B,6) (D,7) (E,6) 
        // OUTPUT : 5
        // (3 + 7 + 6 + 7 + 6) / 5 = 5.8 => average rate = 5 
    }

    //@Override
    //Tìm rate max và min đầu tiên trong danh sách 
    // và hoán đổi vị trí của chúng

    private int getIndexMinRate(List<Car> t) {
        int valueMin = t.get(0).getRate();
        int indexMin = 0;
        for (int i = 1; i < t.size(); i++) { // tìm đến kích thước
            if (t.get(i).getRate() < valueMin) {
                valueMin = t.get(i).getRate();
                indexMin = i;
            }
        }
        return indexMin;
    }

    private int getIndexMaxRate(List<Car> t) {
        int valueMax = t.get(0).getRate();
        int indexMax = 0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getRate() > valueMax) {
                valueMax = t.get(i).getRate();
                indexMax = i;
            }
        }
        return indexMax;
    }
    public void f2(List<Car> t) {
        // tìm vị trí thằng nhỏ nhất đầu tiên
        int indexMin = getIndexMinRate(t);
        // tìm vị trí thằng lớn nhất đầu tiên
        int indexMax = getIndexMaxRate(t);
        // đổi chỗ 2 thằng cho nhau
        Car carTemp = t.get(indexMin); // chứa gt nhỏ nhất
        t.set(indexMin, t.get(indexMax)); 
        t.set(indexMax, carTemp);

        // TEST CASE : 
        // Add how many elements : 0
        // Enter TC (1-f1;2-f2;3-f3) : 2
        // The list before running f1 : 
        // (A,6) (B,2) (C,9) (D,17) (E,8) (F,17) (G,2) 
        //  OUTPUT : (A,6) (D,17) (C,9) (B,2) (E,8) (F,17) (G,2) 
        // (B,2) là min ; (D,17) là max => Đổi chỗ của (D,17) với (B,2) cho nhau



    }

    //  7 9 8 5 
   // @Override

   //Sắp xếp danh sách theo thứ tự bảng chữ cái, trong trường hợp Maker giống nhau, 
   //hãy sắp xếp chúng giảm dần theo rate
    public void f3(List<Car> t) {
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int alphabe = o1.getMaker().compareTo(o2.getMaker());

                if (alphabe == 0) {
                    if (o1.getRate() > o2.getRate()) {
                        return -1;
                    } else if (o1.getRate() == o2.getRate()) {
                        return 0;
                    } else {
                        return 1;
                    }
                } 
                else {
                    return alphabe;
                }
            }
        };
        Collections.sort(t, comparator);
    }

    //TEST CASE : 
    // Add how many elements : 0
    // Enter TC (1-f1;2-f2;3-f3) : 3
    // The list before running f1 :  
    // (H,1) (G,2) (E,3) (F,4) (E,15) (C,6) (B,7) (A,8) 
    // OUTPUT :
    // (A,8) (B,7) (C,6) (E,15) (E,3) (F,4) (G,2) (H,1) 
    
    // Xếp theo thứ tự Alphabet tuy nhiên có 2 kí tự E nên sắp xếp theo
    // thứ tự giảm dần : 15 > 3 => (E,15) -> (E,3) 
    

    

}