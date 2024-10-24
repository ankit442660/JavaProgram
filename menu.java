import java.util.*;

class menu {
    public static void main(String args[]) {
        int a, b, c, choice;
        Scanner s1 = new Scanner(System.in);
        System.out.print("\n main menu");
        System.out.print("\n 1. sum");
        System.out.print("\n 2. sub");
        System.out.print("\n3. mul");
        System.out.print("\n 4. div");
        System.out.print("\n 5. exit");
        System.out.print("\n enter your choice:-");
        choice = s1.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("enter two number:");
                a = s1.nextInt();
                b = s1.nextInt();
                c = a + b;
                System.out.print("\n sum=" + c);
                break;
            }
            case 2: {

                System.out.print("enter two number:");
                a = s1.nextInt();
                b = s1.nextInt();
                c = a - b;
                System.out.print("\n sub=" + c);
                break;
            }
            case 3: {
                System.out.print("enter two number:");
                a = s1.nextInt();
                b = s1.nextInt();
                c = a * b;
                System.out.print("\n mul=" + c);
                break;
            }
            case 4: {
                System.out.print("enter two number:");
                a = s1.nextInt();
                b = s1.nextInt();
                c = a / b;
                System.out.print("\n div=" + c);
                break;
            }
            case 5: {
                break;
            }
            default: {
                System.out.print("invalid case no");
            }
        }
    }
}
