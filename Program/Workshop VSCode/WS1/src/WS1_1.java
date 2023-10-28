import java.util.*;
import java.lang.*;
import java.io.*;

public class WS1_1 {
    //   Find the index of an array element
    public static int findIndex(int[] a, int t) {
            if (a == null) {
                  return -1;
            }
            int len = a.length;
            int i = 0;
            while (i < len) {
                if (a[i] == t) return i;
                else{ 
                    i = i+1;
                }
            }    
            return -1;   
    }
    // Remove a specific element from an array
    public static int[] removeElement(int[] a, int index) {
        if (a == null || index < 0 || index >= a.length) {
            return a;
        }
        int[] a1 = new int[a.length-1] ;
        
        for (int i = 0, k =0; i < a.length; i++) {
            if (i== index) {
                continue;
            }
            a1[k++] = a[i] ;
        }
        return a1;
    }

    
}
    
    

