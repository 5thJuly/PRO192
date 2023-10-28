import java.util.*;


public class WS1_2 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fullname: ");
        String fullname = sc.nextLine();
        
        // khai bao mang, sau do su dung phuong thuc toCharArray();
        
        char[] charArray = fullname.toCharArray();
        boolean foundSpace = true ;
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]) ;
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
            
        }
        fullname = String.valueOf(charArray) ;
        System.out.println("Fullname: " + fullname);
        int idx = fullname.lastIndexOf(' ') ;
        
        String firstname = fullname.substring(0,fullname.indexOf(" "));
        System.out.println("Firstname: " + firstname);
        String lastname = fullname.substring(idx+1);
        System.out.println("Lastname: " + lastname);
    }
}
