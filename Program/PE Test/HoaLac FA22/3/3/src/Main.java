import java.util.*;

public class Main {
    public static void dispList(final List<Cat> t) {
        for (final Cat o : t) {
            System.out.printf("(%s,%d)", o.getArea(), o.getLeg());

        }
        System.out.printf("\r\n", new Object[0]);
    }

    public static void addToList(final List<Cat> t, final String[] a, final int[] b) {
        for (int n = a.length, i = 0; i < n; i++) {
            t.add(new Cat(a[i], b[i]));
        }
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final List<Cat> t = new ArrayList<Cat>();
        final List<Cat> h = new ArrayList<Cat>();
        final String[] c1 = { "A", "D", "C", "B", "E", "F", "G", "H" };
        final String[] c2 = { "H", "G", "F", "E", "D", "C", "B", "A" };
        final int[] d1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        final int[] d2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        final String[] a1 = { "A", "B", "CAB", "D", "E" };
        final int[] b1 = { 3, 7, 6, 7, 6 };
        final String[] a2 = { "A", "C", "B", "D", "E", "F", "G" };
        final int[] b2 = { 6, 9, 2, 9, 2, 9, 2 };
        final String[] a3 = { "H", "G", "E", "F", "E", "C", "B", "A" };
        final int[] b3 = { 19, 21, 38, 47, 56, 65, 74, 83 };
        System.out.print("Add how many elements: ");
        final int n = sc.nextInt();
        sc.nextLine();
        String oArea = "";
        int oLeg = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Area: ");
            oArea = sc.nextLine();
            System.out.print("Enter leg: ");
            oLeg = sc.nextInt();
            sc.nextInt();
            h.add(new Cat(oArea, oLeg));
            t.add(new Cat(oArea, oLeg));
        }
        System.out.print("Enter TC(1-f1;2-f2;3-f3): ");
        final int tc = sc.nextInt();
        sc.nextLine();
        final ICat u = (ICat) new MyCat();
        switch (tc) {
            case 1:
                addToList(t, a1, b1);
                System.out.println("The list before running f1: ");

                dispList(t);

                break;
            case 2:
                addToList(t, a2, b2);
                System.out.println("The list before running f2: ");
                dispList(t);
                break;
            case 3:
                addToList(t, a3, b3);
                System.out.println("The list before running f3: ");

                dispList(t);

                break;

        }
        System.out.printf("OUTPUT:\r\n", new Object[0]);
        switch (tc) {
            case 1:
                final int count = u.f1((List) t);
                System.out.printf("%d\r\n", count);
                break;
            case 2:
                u.f2((List) t);
                dispList(t);
                break;
            case 3:
                u.f3((List) t);
                dispList(t);
                break;
        }
        System.out.println();

    }
}
