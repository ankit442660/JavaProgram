import java.util.*;

class swaping  {
    public static void main(String args[]) {
        int n[] = new int[10];
        int i, j, temp;
        Scanner s1 = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("\n enter no in array\n");
            n[i] = s1.nextInt();
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        System.out.print ("after swaping the value\n");
        for (i = 0; i < 10; i++) {
            System.out.println(n[i]);
        }
    }
}
