//wap to input a number and prints its table in english formet

import java.util.*;

class Table {
    public static void main(String args[]) {
        int num, i, t;
        Scanner s1 = new Scanner(System.in);
        System.out.print("enter a number:");
        num = s1.nextInt();
        for (i = 1; i <= 10; i++) {
            t = num * i;
            System.out.println(num + "*" + i + "=" + t);
        }
    }
}