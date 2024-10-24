public class primeseries {
    public static void main(String args[]) {
        int num, r, c, d;
        System.out.print(" series of  prime number from 1 to 50");
        for (num = 1; num <= 50; num++) {
            d = 1;
            c = 0;
            while (d <= num) {
                r = num % d;
                if (r == 0) {
                    c = c + 1;
                }
                d++;
            }
            if (c == 2) {
                System.out.println(num);
            }
        }

    }

}
