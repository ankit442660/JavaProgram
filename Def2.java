class A{
    public A()
    {
        System.out.print("\n  Default parent A");}

}
class B extends A
{
    public B()
    {

        System.out.print("\n default intermediate parent");
    }
}
class C extends B{
    public C()
    {

        System.out.print("\n  default child ");
    }
}

public class Def2 {
    public static void main(String agrs[])
    {

        C c1=new C();
    }
}
