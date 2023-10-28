public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {// the tich
        return super.getArea() * 2;
    }

    @Override
    public String toString() {

        return super.toString() + "\t" + "height : " + height;
    }

}
