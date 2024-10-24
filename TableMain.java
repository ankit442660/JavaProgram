import java.util.*;

class Table {
    private int t;

    public Table(int num) {
        for (int i = 1; i <= 10; i++) {
            t = num * i;
            System.out.println(t);
        }
    }

}

public class TableMain {
    public static void main(String args[]) {
        int num;
        Scanner s1 = new Scanner(System.in);
        System.out.print("\n emter any number:-");
        num = s1.nextInt();
        Table t1 = new Table(num);
    }

}
