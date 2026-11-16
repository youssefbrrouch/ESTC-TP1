public class Point {
    double x;
    double y;

    void translater(double dx, double dy) {
        x += dx;
        y += dy;

    }

    void foo(double x, Point p) {
        p.translater(10, 10);
        x = x + 10;
        p = new Point();
        p.translater(10, 10);
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p2.x = 15;
        p2.y = 11;
        p1.x = 20;
        p1.foo(p1.x, p2);
        System.out.println("p1.x " + p1.x);
        System.out.println("p2.x " + p2.x);
        System.out.println("p2.y " + p2.y);
    }
}
