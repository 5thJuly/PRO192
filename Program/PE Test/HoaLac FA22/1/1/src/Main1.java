import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter label: ");
        String name = sc.nextLine();
        System.out.print("Enter type: ");
        int type = Integer.parseInt(sc.nextLine());

        System.out.println("1.Test getLabel()");
        System.out.println("2.Test setType()");
        System.out.print("Enter TC(1 or 2): ");
        
        Cement c = new Cement(name, type) ;

        int tc = Integer.parseInt(sc.nextLine());

        switch(tc) {
            case 1:
                System.out.println(c.getLabel());
                break;
            case 2:
                System.out.print("Enter new type: ");
                type = sc.nextInt();
                c.setType(type);
                
                System.out.println(c.getType());
        }



    }
}
