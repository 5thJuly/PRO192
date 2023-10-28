
import java.util.Scanner;


public class Main {

    //alt
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = sc.nextLine();

        System.out.print("Input salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        System.out.print("Input phone: ");
        String phone = sc.nextLine();

        Employee e = new Employee(phone, salary, name);
        System.out.print("Input your choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.println(e.getName());
                break;
            case 2:
                Vali v = (Vali) new Validate();
                System.out.println(v.f1(e));
                break;
            case 3:
                Vali v1 = (Vali) new Validate();
                System.out.println(v1.f2(e));
                break;
        }

    }
}
