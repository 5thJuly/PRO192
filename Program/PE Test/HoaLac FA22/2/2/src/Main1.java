import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.print("Enter area: ");
        String area = sc.nextLine();
        System.out.print("Enter leg:");
        int leg = Integer.parseInt(sc.nextLine()); 
        System.out.print("Enter noise: ");
        int noise = Integer.parseInt(sc.nextLine());

        Cat c = new Cat(area, leg);
        SpecCat c2 = new SpecCat(area, leg, noise);

        
        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        int tc = Integer.parseInt(sc.nextLine());

        switch(tc) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(c.toString());
                System.out.println(c2.toString());
                break;
            case 2:
                System.out.println("OUTPUT:");
                c2.setData();
                System.out.println(c2.getArea() + ", " + c2.getLeg());
                break;
            case 3:
                System.out.println("OUTPUT:");
                System.out.println(c2.getValue());
                break;


        }

    }
    
}
