 //p to print the multiplication table from 1 to 10
public class multiplication {
    public static void main(String args[]) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
    }
}