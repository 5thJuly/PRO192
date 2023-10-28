public class MainCircle {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 5);
        System.out.println("\n\n"+m1);
        m1.moveLeft();
        System.out.println("\n\n"+m1);

        Movable m2 = new MovableCircle(2, 1, 2, 20, 20) ;
        System.out.println("\n\n"+m2);
        m2.moveRight();
        // m2.moveUp();
        // m2.moveDown() ;
        System.out.println("\n\n"+m2 + "\n");
    }
}
