//wap to swap the value without using third variable

import java.util.*;

public class swapvalue {
    public static void main(String args[]) {
        int a, b;
        Scanner s1 = new Scanner(System.in);
        System.out.print("enter two number\n");
        a = s1.nextInt();
        b = s1.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("affter swaping the value of a is= " + a + "    after swaping the value b is=" + b);

    }

}
