import java.util.*;
public class Reverse1 {
    public static void main(String args[])
    {
        int num,d=0,rev=0;
Scanner s1=new Scanner(System.in);
        System.out.print("enter a number");
        num=s1.nextInt();
        while(num>0)
        {
            d=num%10;
            rev=rev*10+d;
            num=num/10;

        }
        System.out.print("\nreverse of inputted number is ="+rev);
    }
    
}
