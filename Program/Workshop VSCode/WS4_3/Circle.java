public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        
        return radius*2*Math.PI;
    }



    @Override
    public double getArea() {
        
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        
        return String.format("Circle has radius = %1$f", radius);
    }




    
    
}
