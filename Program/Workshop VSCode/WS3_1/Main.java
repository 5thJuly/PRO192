import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter radius : ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.print("Enter color : ");
        String color = sc.nextLine();
        System.out.print("Enter height : ");
        double height = Double.parseDouble(sc.nextLine());
        Cylinder c = new Cylinder();
        c.setRadius(radius);
        c.setColor(color);
        c.setHeight(height);
        System.out.println(c.toString());
        System.out.println("\nArea = " + c.getArea());
        System.out.println("\nVolume = " + c.getVolume());
       
    
    }
}
