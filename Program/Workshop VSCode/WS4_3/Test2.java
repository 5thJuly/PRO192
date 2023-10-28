public class Test2 {
    public static void main(String[] args) {
        GeometricObject g2 = new Circle(5.0);
        System.out.println("\n" + g2);
        System.out.println("\nPerimeter = " + g2.getPerimeter());
        System.out.println("\nArea = " + g2.getArea());

        Resizable g3 = new ResizableCircle(50);
        System.out.println(g3);
        // System.out.println("Perimeter = "+g3.getPerimeter());
        // System.out.println("Area = "+g3.getArea());
        g3.resize(50);
        //System.out.println(g3);
        // System.out.println("Perimeter = "+g3.getPerimeter());
        // System.out.println("Area = "+geomObj2.getArea());

        GeometricObject g4 = (GeometricObject) g3;
        System.out.println(g4);
        System.out.println("\nPerimeter = " + g4.getPerimeter());
        System.out.println("\nArea = " + g4.getArea());
    }
}
