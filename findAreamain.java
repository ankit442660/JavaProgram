import java.util.*;
class findArea
{
    private int ar;
    public void area(int l)
    {
        ar=6*l*l;
        System.out.print("\n Area of cube is="+ar);
    }
    public void area(int l,int b,int h)
    {
ar=2*(l*b+b*h+h*l);
System.out.print("\n area of cubiod="+ar);
    }
}

public class findAreamain 
{
    public static void main(String args[])
    {
        int l,b,h;
        Scanner s1=new Scanner(System.in);
        System.out.print("\n enter l,b,h:-\n");
        l=s1.nextInt();
        b=s1.nextInt();
        h=s1.nextInt();
        findArea f1=new findArea();
        f1.area(l);
        f1.area(l,b,h);
    }
}
