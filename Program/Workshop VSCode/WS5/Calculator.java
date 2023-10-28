import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a: ");
            a = sc.nextInt();
            System.out.print("Input b: ");
            b = sc.nextInt();
            if (a <= -1000 || a >= 1000 || b <= -1000 || b > 1000)
                throw new NumberOutOfRangeException("Number is outside the computation!");
            Calculator o = new Calculator();
            System.out.println(o.multiply(a, b));
            System.out.println(o.divide(a, b));
            
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero!");
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        return x / y;
    }
}