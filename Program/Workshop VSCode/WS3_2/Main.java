import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("\nEnter your address: ");
        String address = sc.nextLine();

        System.out.print("\nEnter your program: ");
        String program = sc.nextLine();

        System.out.print("\nEnter year: ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.print("\nEnter the fee you have to pay: ");
        double fee = Double.parseDouble(sc.nextLine()) ;

        System.out.print("\nEnter the school: ");
        String school = sc.nextLine();
        
        System.out.print("\nPay: ");
        double pay = Double.parseDouble(sc.nextLine());

        Student s = new Student(name, address, program, year, fee);
        Staff f = new Staff(name, address, school, pay) ;

        System.out.println("\n" + s.toString());
        System.out.println("\n" + f.toString());





        
    }
}
