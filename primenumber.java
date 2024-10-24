import java.util.*;
public class primenumber {
    public static void main(String args[])
    {
        int c=0;
        Scanner s1=new Scanner(System.in);
        System.out.print("\nenter a number=");
        int a=s1.nextInt();
        for( int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.print("\n inputted number is prime="+a);
        }
        else{
            System.out.print("\n inputted number is not prime");
        }
    }
    
}
