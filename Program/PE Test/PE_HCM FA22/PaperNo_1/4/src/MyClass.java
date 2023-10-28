/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyClass implements IProcess {

    @Override
    public long factorial(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        return result;
    }

    @Override
    public String checkString(String string) {
        String sub1 = string.substring(0, 2);
        String sub2 = string.substring(2);
        boolean check1 = true;
        boolean check2 = true;
        if (!(sub1.equals("hd")||sub1.equals("HD"))) {
            check1 = false;
        }
        if (sub2.length() != 6) {
            check2 = false;
        } else {
            for (int i = 0; i < sub2.length(); i++) {
                if (!(sub2.charAt(i) <= '9' && sub2.charAt(i) >= '0')) {
                    check2 = false;
                    break;
                }
            }
        }
        return (check1 && check2) ? "Sucess" : "Fail";
    }

}
