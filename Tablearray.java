//wap to create 10 block of array and store the table of 5
class Tablearray {
    public static void main(String args[]) {
        int x[] = new int[10];
        int i, num, j = 0;
        for (i = 1; i <= 10; i++)

        {
            num = 5 * i;
            x[j] = num;
            j++;
        }
        System.out.print("\n table of array\n");
        for (i = 0; i < 10; i++) {

            System.out.println(x[i]);

        }
    }
}