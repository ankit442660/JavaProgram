class A{
    public A()
    {
System.out.println("constructor activated");
    }
public void f1()
{
    System.out.print("\n normal method");
}
public void finalize()
{

System.out.flush();
}
}

public class destructor {
    public static void main(String args[])
    {
        A a1=new  A();
        a1.f1();
        a1.finalize();
    }
    
    
}
