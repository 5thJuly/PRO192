import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("\nEnter name: ");
        String name = sc.nextLine();
        System.out.print("\nEnter price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("\nEnter quantity: ");
        int quantity = sc.nextInt();
        
        Product p = new Product(id, name, price, quantity, id);
        System.out.println("1.Test subTotal: ");
        System.out.println("2.Test setDiscount: ");
        System.out.print("Test case [1 or 2]:  ");
        int tc = sc.nextInt();
        
        switch(tc) 
        {
            case 1:
                System.out.println(p.subTotal());
                break;
            case 2:
                System.out.print("Enter discount (%): ");
                int discount = sc.nextInt();
                p.setDiscount(discount);
                System.out.println(p.subTotal());
                
                break;
        }
        
    }
}
