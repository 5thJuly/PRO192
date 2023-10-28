/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class A { 
    static int a = 1;
    static {
    a = 3 ;
    }
    public A(){ a = 1; }
    public void Print(){ System.out.print(a*a); }
    static class B{
    int x = 3;
    public void Print(){ System.out.print(x + a); }
    } }
