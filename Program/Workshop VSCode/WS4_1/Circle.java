public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double d, String string, boolean b) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        
        return radius*2*Math.PI;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj instanceof Circle){
            return (this.radius == ((Circle)obj).radius && super.equals(obj));
        }
        return false;
    }
    // @Override
    // public String toString() {
    //     return String.format("A Circle with radius = %f, which is a subclass of %s", radius, super.toString());
        
    // }
    @Override
    public String toString() {
        
        return super.toString() + " || " + "Radius: " + radius;
    }

    
    
    
    
    
}
