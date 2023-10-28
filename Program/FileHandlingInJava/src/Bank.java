import java.util.*;
import java.io.*;


public class Bank {
    static int lastAccountNumber;
    
    Account account[] ;
    Scanner input = new Scanner(System.in);
    File f = new file("AccountManagement.dat") ;

    public Bank() {
        account = new Account[10] ;
        lastAccountNumber = 0;
    }
    
    
}
