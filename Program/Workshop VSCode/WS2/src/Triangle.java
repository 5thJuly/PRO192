import java.util.*;

public class Triangle {
    private float width = 0.0f;
    private float height = 0.0f;

    public Triangle() {

    }

    public Triangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {

        return "Triangle[width = " + width + ", " + "height = " + height + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        float width = sc.nextFloat();
        System.out.print("Enter the height: ");
        float height = sc.nextFloat();
        Triangle a = new Triangle();
        a.setWidth(width);
        a.setHeight(height);
        System.out.println(a.toString());

    }

}
