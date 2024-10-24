 import java.util.*;
 public class armstrong {
    public static void main(String[] args)
    {
        int num,d,arm=0,num1;
        Scanner s1=new Scanner(System.in);
        System.out.print("enter a number= ");
        num=s1.nextInt();
        num1=num;
        while(num>0)
        {
            d=num%10;
            arm=arm+d*d*d;
            num=num/10;
        }
        if(num1==arm)
{
        System.out.print("\n number  is   Armstrong ");
}
        else
        {

        System.out.print("\n num is not a armstrong");
        }
    }
    
}
 