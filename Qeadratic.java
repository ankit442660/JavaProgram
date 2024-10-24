import java.util.*;

public class Qeadratic {
    public static void main(String args[]) {
        int a, b, c, d;
        double r1, r2;
        Scanner s1 = new Scanner(System.in);
        System.out.print("\n enter the cofficient");
        a = s1.nextInt();
        b = s1.nextInt();
        c = s1.nextInt();
        d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.print("\n roots are imagenary");
        } else if (d > 0) {
            System.out.print("\n root are real and uneqal");
            r1 = (-b + Math.sqrt(d)) / 2 * a;
            r2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.print("\n first root=" + r1);
            System.out.print("\n second root=" + r2);
        } else if (d == 0) {
            System.out.print("\n root are real and equal");
            r1 = b / 2 * a;
            r2 = -b / 2 * a;
            System.out.print("\n first root=" + r1);
            System.out.print("\n second root=" + r2);
        }
    }
}
