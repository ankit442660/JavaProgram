class A{
public A()
{
    System.out.print("\n Default in parent");
}
public A(int x)
{
    System.out.print("\n para in parent A");
    System.out.print("\n X="+x);
}
}
class B extends A{
    public B(int y)
    {
        System.out.print("\n para in child B");
        System.out.print("\n x="+y);
    }
}



public class def3 {
    public static void main(String arg[])
    {
        B b1=new B(20);
    }
}
