import java.util.*;
class copysum
{
    private int x;
    public copysum(int n)
    {
        x=n;
    }
    public copysum(copysum p1,copysum p2)
    {
        x=p1.x+p2.x;
    }
    public void show()
    {
        System.out.println("x="+x);
    }

    
}

public class copysumMain {
    public static void main(String args[])
    {
        int m,n;
        Scanner s1=new Scanner(System.in);
        System.out.print("enter two number");
        m=s1.nextInt();
        n=s1.nextInt(); 
        copysum obj1=new copysum(n);
        obj1.show();
        copysum obj2=new copysum(m);
        obj2.show();
        copysum obj3=new copysum(obj1,obj2);
        obj3.show();
    }

    
}
