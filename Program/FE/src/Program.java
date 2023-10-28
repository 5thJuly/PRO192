/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class Program {
 public static void main(String[] args) { 
 int s = 0;
 List<Integer> arr = new ArrayList();
 arr.add(4);
 arr.add(2);
 arr.add(5);
 for(int i:arr){
 s+=i;
 }
 System.out.println(s/arr.size());
 } }