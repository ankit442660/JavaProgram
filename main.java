

class A{
    private int x;
    int y;
    public void f1()
    {
        System.out.print("\n parent class A");
        x=5;
        y=10;
        System.out.print("\n X=" +x);
        System.out.print("\n y="+y);
    }
}
class B extends A{
    int m;
    private int n;
    public void f2()
    {
        System.out.print("\n child class B");
        //x=10; not valid ,private variable can not be access by child class
    
        y=20;
        m=30;
        n=40;
System.out.print("\n y= "   +y);

System.out.print("\n M= "   +m);

System.out.print("\n N= "   +n);
    }
}



public class main {
    public static void main(String args[])
    {
        A a1=new A();
        a1.f1();
        B b1=new B();
        b1.f1();
        b1.f2();
    }
    
}
