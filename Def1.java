class A{
    public A()
    {
        System.out.print("\n default constructor ");
    }
}
class B extends A{
    public B()
    {
        System.out.print("\n default child");
    }
}






public class Def1 {
    public static void main(String args[])
    {
        B b1=new B();
    }
}
