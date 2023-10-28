
package Practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Validate {

    //dem  so luong chu trong chuoi
    public void f1(String txt) {
        String[] list = txt.split(" ") ;// list se chua cac chu cai nhap vao
        System.out.println(list.length);// in ra do dai cua list
    }

    //dao nguoc chu cua chuoi
    public void f2(String txt) {
        String[] list = txt.split("\\s+") ; // \\s+ " split o cho co 1 dau cach hoac nhieu dau cach
        for (int i = list.length-1; i >=0; i--) {// bat dau tu 0
            System.out.println(list[i]);
            
        }
    }

    //sap xep va in ra cac phan tu trong chuoi theo thu tu tang dan
    public void f3(String txt) {
       String[] list = txt.split("\\s+") ;
       List<String> listS = new ArrayList<>() ;
       for (String o : listS) {
            listS.add(o) ; // chua toan bo phan tu cua listS
            
        }
       Collections.sort(listS, (String o1, String o2) -> o1.compareTo(o2) // sap xep theo thu tu tang
       );
        for (String o : listS) {
            System.out.println(o); // in ra man hinh
            
        }

    }

    //tinh tong cac so le xuat hien trong chuoi
    public void f4(String txt) {
        int total = 0;
        for (int i = 0; i < txt.length(); i++) {
            if(Character.isDigit(txt.charAt(i))) {// kiem tra co phai chu so hay khong
                int number = Integer.parseInt(txt.charAt(i) +"") ;
                if(number %2 ==1) {
                    total = total + number ;
                }
            }
            
        }
        System.out.println("\nTotal = " + total);
    }

    //thay the cac ki tu so bang ki tu 'a'
    public void f5(String txt) {
        for (int i = 0; i < txt.length(); i++) {// duyet tu dau den cuoi chuoi
            if(Character.isDigit(txt.charAt(i))) { //neu ki tu trong chuoi la ki tu so thi se thuc hien 1 lenh nao do
                txt = txt.replace(txt.charAt(i), 'a'); // cu phap thay the : replace -- thay the ki tu so bang chu a
                
            }
            
        }
        System.out.println(txt);
    }

    //dem xem co bao nhieu chu "anh" xuat hien trong chuoi
    public int f6(String txt) {
        int count = 0;
        for (int i = 0; i <= txt.length()-3; i++) { //txt.length()-3 : dam bao chay den chu a thi dung, dam bao code luon dung
            String cut = txt.substring(i, i+3) ; // lay 3 ki tu 1 lan
            if(cut.equals("anh")) { 
                count++;
            }
            
        }
        return count;
    }

}
