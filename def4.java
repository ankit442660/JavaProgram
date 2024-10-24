class A{
    public A()
    {
        System.out.print("\n Default parent");
    }
    public A(int x)
    {
System.out.print("\n para in parent A");
System.out.print("\n x="+x);
    }
}
class B extends A{
    public B()
    {
        System.out.print("\n intermediate parent");
        
    }
    public B(int y)
    {
        System.out.print("\n para in intermediate parent");
        System.out.print("\n Y="+y);
    }

}
class C extends B
{
    public C(int Z)
    {
        System.out.print("\n para in child C");
        System.out.print("\n Z="+Z);
    }
}


public class def4 {
    public static void main(String args[])
    {
        A a1=new A(5);
        B  b1=new B(29); 
        C  c1=new C(39);
    }
}
