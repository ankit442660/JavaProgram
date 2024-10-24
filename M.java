class A{
    public A()
    {
        System.out.print("construct activated");
    }
    public void f1()
    {
        System.out.print("  \n member Method ");
    }
}

public class M 
{
    public static void main(String args[])
    {
    A a1=new A();
    a1.f1();
    }
    
}
