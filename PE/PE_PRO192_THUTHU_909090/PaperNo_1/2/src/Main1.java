import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter owner: ");
        String owner = sc.nextLine();
        System.out.print("Enter price: ");
        int price = Integer.parseInt(sc.nextLine()) ;
        System.out.print("Enter color: ");
        int color = Integer.parseInt(sc.nextLine());

        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        int tc = sc.nextInt();
        Cala c1 = new Cala(owner, price);
        SpecCala c2 = new SpecCala(color, owner, price);

        switch(tc) {
            case 1: 
                System.out.println("OUTPUT: ");
                System.out.println(c1.toString());
                System.out.println(c2.toString());
                break;
            case 2:
                System.out.println("OUTPUT: ");
                c2.setData();
                System.out.println(c2.getOwner() + ", " + c2.getPrice());
                break;
            case 3: 
                System.out.println("OUPUT: ");
                System.out.println(c2.getValue());
        }


    }
}
