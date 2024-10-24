 import java.util.Scanner;
 public class Circle {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the radius of circle:");
        int a=s1.nextInt();
        double r=(a*a)*3.14;
        System.out.print("The area of circle is="+r);

    }
    
}
