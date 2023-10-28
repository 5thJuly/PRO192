public class Test1 {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(8.0) ;
        System.out.println("\n"+g1);
        System.out.println("\nPerimeter = " + g1.getPerimeter());
        System.out.println("\nArea: " + g1.getArea());
    }
}
