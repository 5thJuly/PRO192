import java.util.*;
public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("\nEnter x : ");
        float x = sc.nextFloat();
        
        System.out.print("\nEnter y: ");
        float y = sc.nextFloat();
        
        System.out.println(x);
        System.out.println(y);
    }

    
    
    
}
