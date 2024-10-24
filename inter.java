interface A
{
    int x=10;
    void f1();
//System.out.print(x);
    
}
class B implements A
{
    public void f1()
    {
System.out.print(x);
    System.out.print("\n child b");
    }
}
class C implements A
{
    public void f1()
    {
System.out.print(" \n child c");
    }
}


public class inter {
    public static void main(String args[])
    {
        A a1;
        a1=new B();
        a1.f1();
        a1=new C();
        a1.f1();
    }
}
