public class MyString {

    //@Override
    // tra ve tong cac so le trong chuoi
    public int f1(String str) {
        int sum = 0;
        char[] a = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if("13579".contains("" + a[i])) {
                sum += a[i] - '0' ;
            }

            
        }

        return sum;

    }

    // TEST CASE 
    //1. Test f1()
    //2. Test f2()
    // Enter TC (1 or 2) : 1
    // Enter String : 
    // dffbwe8d218e924492 
    // OUTPUT : 1+9+9 = 19

    //@Override 
    //Trả về chuỗi s, có được bằng cách di chuyển từ dài nhất (đầu tiên) 
    //trong str đến cuối của nó (từ = một chuỗi không có (các) khoảng trắng)
    public String f2(String str) {
        String[] s= str.split("\\s") ;
        int max = 0;
        int pos = 0;
        for (int i = 0; i < s.length; i++) {
            if(max < s[i].length()) {
                max = s[i].length();
                pos = i;
            }

        }
        String output ="" ;
        for (int i = 0; i < s.length; i++) {
            if(i ==pos) {
                output += s[i] + " " ;

            }
        }
        output += s[pos] ;

        return output.trim();

    }
    // TEST CASE 
    //1. Test f1()
    //2. Test f2()
    // Enter TC (1 or 2) : 2
    // Enter a String :
    // ab a1234 cd aa b1234 xy
    //OUTPUT :
    // ad cd aa b1234 xy a1234 
    // chuyển a1234 -> cuối ta được output :ad cd aa b1234 xy a1234 

}