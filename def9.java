class A{
    public void show()
    {
        System.out.print("\n parent class");
    }
}
class B extends A{
    public void show()
    {
        System.out.print("\n child class");
        super.show();
    }
}
class C extends A
{
    public void show(){
super.show();
System.out.print("\n child c");
    }
}
public class def9 {
    public static void main(String args[])
    {
        B b1=new B();
        b1.sho();
        C c1=new C();
        c1.show();
    }
}
