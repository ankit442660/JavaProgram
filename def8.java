class A{
    public void f1()
    {
        System.out.print("\n parent");
    }
}
class B extends A{
    public void f1()
    {
        System.out.print("\n child");
    }
}







/*public class def8 {
    public static void main(String args[])
    {
        B b1=new B();
        b1.f1();
    }
    
}*/
class def8{
    public static void main(String args[])
    {
        A  a1=new A();
        B b1=new B();
        a1.f1();
        b1.f1();
    }
}