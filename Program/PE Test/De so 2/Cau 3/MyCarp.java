import java.util.Collections;
import java.util.List;

public class MyCarp /* implements Icarp */ {
    
    //@Override 
    // giả sử ponds có ít nhất 2 kí tự. Đếm và trả về
    // số phần tử pond mà phần tử thứ 2 là số chẵn

    private boolean isEven(char c) {
        if (c == '0' || c == '2' || c == '4' || c == '6' || c =='8') 
            return true ;
    
        return false;
    }


    public int f1(List<Carp> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if(isEven(t.get(i).getPond().charAt(1)) == true) {
            // if(t.get(i).getPond().charAt(1) == '2' || t.get(i).getPond().charAt(1) == '4' || 
            // t.get(i).getPond().charAt(1) == '6' || t.get(i).getPond().charAt(1) == '8') {}
                count++;
            }
        }
        return count;
 
        
        

    }

//@Override 
    // giả sử ponds có ít nhất 2 kí tự. Đếm và trả về
    // số phần tử pond mà phần tử thứ 2 là số chẵn
    // Cach 2 : 
    public int f2(List<Carp> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            try {
                // ABC234 
                // Bat dau tu A va dung o B : Lay ki tu dung thu 2
                System.out.println(t.get(i).getPond().substring(1, 2));

                int x = Integer.parseInt(t.get(i).getPond().substring(1, 2)) ;
                if ( x % 2 == 0) {
                    count++;
                }
            } catch (Exception e) {
                
            }
        }
        return count;

        // Test case : 
        // Add how many elements : 0 
        // Enter TC(1-f1;2-f2;3-f3) : 1 
        // The list before learning f1 : 
        //(A2,6) (BX,2) (C1,4) (D2,8) (E3,9) (F1,7)
        //OUTPUT : 2 ((A2,6) (D2,8))

}
    

    // @Override
    // Tìm phần tử đầu tiên có pond là chuỗi palindrom, sau đó thay đổi trạng thái của nó thành 99
    // (chuỗi s được gọi là palindrom nếu nó giống với chuỗi ngược lại của nó
    private boolean isPalindrom(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length())-1-i) {
                return false ;

            }

        }
        return true;
    }
    
    public void f3(List<Carp> t) {
        // ABCDDCBA -> palindrom
        // ABCDCBA -> palidrom 
        for (int i = 0; i < t.size(); i++) {
            if(isPalindrom(t.get(i).getPond()) == true) {
                t.get(i).setState(99);
                return ; // Nếu không có tất cả palindrom đều đổi về 99
            }
            
        }
    
        // Test case : 
        // Add how many elements : 0 
        // Enter TC(1-f1;2-f2;3-f3) : 2
        // The list before running f2 : 
        // (AB,6) (BCB,2) (CAC,4) (DX,8) (EY,9) (F,7) 
        //OUTPUT :
        // (AB,6) (BCB,99) (CAC,4) (DX,8) (EY,9) (F,7)
        // BCB là palindrom, CAC cũng là palindrom nhưng đứng vị trí second
        // => Chỉ in (BCB,2) => (BCB,99)



    }


    // @Override
    //Giả sử danh sách t chứa ít nhất 5 phần tử và tất cả các pond chứa ít nhất 2 ký tự. 
    //Sắp xếp 5 phần tử đầu tiên của danh sách tăng dần theo trạng thái, 
    //trong trường hợp các trạng thái giống nhau,hãy sắp xếp chúng tăng dần theo ký tự thứ hai của pond

    public void f4(List<Carp> t) {
        //Collections.swap : đổi chỗ 2 phần tử trong list
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //check xem vi tri i cua state co nho hon khong
                if(t.get(i).getState() < t.get(j).getState()) { // xep theo thu tu tang dan
                    Collections.swap(t, i, j);
                }
                // Neu state == thi xet tiep den pond
                else if(t.get(i).getState() == t.get(j).getState()) {
                    // Xet pond neu no nho hon thi swap
                    if(t.get(i).getPond().charAt(1) > t.get(j).getPond().charAt(1)) {
                        Collections.swap(t, i, j);
                    }
                }
                
            }
            
        }

    }
    // Test case : 
        // Add how many elements : 0 
        // Enter TC(1-f1;2-f2;3-f3) : 3
        // The list before running f3 : 
        // (A8,9) (B9,2) (C7,8) (D3,2) (E6,7) (F5,6) (G4,5) (H3,4) 
        // OUTPUT :
        // (D3,2) (B9,2) (E6,7) (C7,8) (A8,9) (F5,6) (G4,5) (H3,4)
        //  
}
