public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------Shape----------\n");

        Shape s1 = new Circle("Blue", true, 5.6); 
        System.out.println(s1);                     
        System.out.println(s1.getArea());        // khong co   
        System.out.println(s1.getPerimeter());   // khong co  
        System.out.println(s1.getColor());      
        System.out.println(s1.isFilled());
       
        
           
        Circle c1 = (Circle)s1;      
        System.out.println("\n----------Circle-----------");              
        System.out.println("\n\n"+c1);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Filled: " + c1.isFilled());
        
        System.out.println("Is this equals (True or Flase) :  " + c1.equals(s1));
        
           
        
           
        Shape s3 = new Rectangle("Red", false, 8.3, 5.7);   
        System.out.println("\n\n"+s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        
           
        Rectangle r1 = (Rectangle) s3;  
        System.out.println("\n-------Rectangle--------"); 
        System.out.println("\n\n"+r1);
        System.out.println("Area: " +r1.getArea());
        System.out.println("Color: " +r1.getColor());
        System.out.println("Length: " + r1.getLength());
        System.out.println("Is this equals (True or Flase) :  " + r1.equals(s1));
        
           
       
        Shape s4 = new Square("Orange", true, 5.6, 8.7, 1.5);   
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
       
        Rectangle r2 = (Rectangle)s4;
        System.out.println("\n\n"+r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Color: " + r2.getColor());
        
        System.out.println("Length: "+r2.getLength());
           
        
        Square sq1 = (Square) r2;
        System.out.println("\n------Square-------");
        System.out.println("\n\n"+sq1);
        System.out.println("Area: " +sq1.getArea());
        System.out.println("Color: " +sq1.getColor());
        System.out.println("Side: "+sq1.getSide());
        System.out.println("Length: " + sq1.getLength());
        System.out.println("Is this equals (True or Flase) :  " + r1.equals(sq1) + "\n");
        

        
        

    }

}