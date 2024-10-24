public class pattern2 {

    public static void main(String args[]) {
        int i, j, k = 0;
        for (i = 1; i <= 9; i++) {
            for (j = 9 - k; j >= i; j -= 2) {
                System.out.print("     " + j);
            }
            System.out.println();
            k += 2;
        }
    }

}
