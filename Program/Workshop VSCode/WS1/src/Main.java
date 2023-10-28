import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("So pt trong mang: ");
            n = Integer.parseInt(sc.nextLine());

        } while (n < 0);
        int[] a = new int[n];
        System.out.println("Input array : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + "/" + n + ": ");
            a[i] = sc.nextInt();

        }
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");

        }
        System.out.println("\n------------------------");
        System.out.println("1.Find the index of an array element");
        System.out.println("2.Remove a specfic element form an array");
        System.out.println("3.Insert an element (specific position) into an array");
        System.out.println("4.Find the maximum and minimum of an array");
        System.out.println("5.Find the duplicate values of an array of integer values");

        WS1_1 s = new WS1_1();
        System.out.print("Enter TC : ");
        int tc = sc.nextInt();
        int t, index;
        switch (tc) {
            case 1:
                System.out.println("Input the index you want to find : ");
                t = sc.nextInt();
                System.out.println("Index position of " + t + " is : " + WS1_1.findIndex(a, t));
                break;
            case 2:
                System.out.print("Input element you want to remove: ");
                index = sc.nextInt();
                System.out.println("Index to be removed: " + index);
                a = WS1_1.removeElement(a, index);
                System.out.println("Resultant Array: " + Arrays.toString(a));
                break;
            case 3:
                int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

                System.out.print("Position: ");
                int Index_position = sc.nextInt();
                System.out.print("Value: ");
                int newValue = sc.nextInt();

                System.out.println("Original Array : " + Arrays.toString(my_array));

                for (int i = my_array.length - 1; i > Index_position; i--) {
                    my_array[i] = my_array[i - 1];
                }

                my_array[Index_position] = newValue;
                System.out.println("New Array: " + Arrays.toString(my_array));
                System.out.println("\nArray with " + newValue + " inserted at position " + Index_position + ":\n"
                        + Arrays.toString(a));
                break;
            case 4:
                int maxValue = a[0];
                for (int i = 1; i < n; i++) {
                    if (a[i] > maxValue) {
                        maxValue = a[i];
                    }

                }
                System.out.println("Max value : " + maxValue);
                int minValue = a[0];
                for (int i = 1; i < n; i++) {
                    if (a[i] < minValue) {
                        minValue = a[i];
                    }
                }
                System.out.print("Min value : " + minValue);
                break;

            case 5:
                System.out.println("Duplicate elements in given array: ");
                for (int i = 0; i < a.length; i++) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] == a[j])
                            System.out.println(a[j]);
                    }
                }
                break;
            default:
                System.out.println("Bye bye <3 !!");
                break;

        }

    }

}
