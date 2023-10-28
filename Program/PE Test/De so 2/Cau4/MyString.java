
public class MyString /* implements IString */ {

    // @Override 
    //Tra ve tong cac so nguyen to trong chuoi

    // Truong hop co cac ki tu duoi 10 
    // private int isPrime(char x) {
    //     if (x == '2') return 2;
    //     if (x == '3') return 3;
    //     if (x == '5') return 5;
    //     if (x == '7') return 7;
        
    //     return -1;
    // }

    

    // public int f1(String str) {
    //     int sum = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         if(isPrime(str.charAt(i)) != -1) {
    //             sum += isPrime(str.charAt(i)) ;
    //         }
            
    //     }
    //     return sum;
        
     // Enter TC(1 or 2) : 1 
    // Enter a string : a2b35c68
    // OUTPUT : 10 (2 + 3 + 5 = 10) 

    // }

    // Cach 2 
    private int isPrime(String x) {
        try {
            int y = Integer.parseInt(x) ;
            if(y < 2) return -1 ;
            for (int i = 2; i < y; i++) { // vi so nguyen to bat dau tu 2 nen i = 2
                
                if(y % i == 0) return -1;
            }
            return y;
        } catch (Exception e) {
            return -1 ;
        }
        
       
    }
    public int f1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String x =str.substring(i, i+1) ;
            if(isPrime(x) != 1) {
                sum += isPrime(x);
            }
            
        }
        return sum;

         // Enter TC(1 or 2) : 1 
    // Enter a string : a2b35c6853342
    // OUTPUT : 10 (2 + 3 + 5 + 5 + 3 + 3 + 2 = 23) 

    }



    // @Override 
    // Giả sử x là từ xuất hiện nhiều nhất đầu tiên trong chuỗi str (word = một chuỗi không có khoảng trắng). 
    // Trả về chuỗi s, có được bằng cách thay thế mỗi từ x trong str bằng ký tự, 
    // (Trong ví dụ dưới đây x = "ab")

    private String findFrequent(String[] words) {
        int count = 0;
        int max = 0;
        String sMax = "" ; 
        for (int i = 0; i < words.length; i++) {
            // Neu words[i] = words[j] -> lap lai -> count + 1 = count++
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++ ;
                }                 
            }
            // ra khoi vong for cua j thi so sanh count voi max
            // neu count > max thi reset lai max va gan sMax = words tai thoi diem do
            if (count > max) {
                max = count ;
                sMax = words[i] ;
            }
            count = 0;
        }
        return sMax;
    }

    public String f2(String str) {
        String words[] = str.split("\\s") ;
        String sMax = findFrequent(words) ;
        
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(sMax)) {
                words[i] = "T" ;
            } 
        }
        String s = words[0] ;
        for (int i = 0; i < words.length; i++) {
            s += " " + words[i] ;
        }
        
        return s.trim();
    }
    // Test case 1
    // Enter TC (1 or 2) : 2 
    // Enter a String : 
    // cd ab xyz ab xyz xyz ab cd
    // OUTPUT :
    // cd T xyz T xyz xyz T cd

    // Test case 2
    // Enter TC (1 or 2) : 2 
    // Enter a String : 
    // cd ab xyz ab xyz xyz ab cd xyz
    // OUTPUT : 
    // cd ab T ab T T ab cd T

}