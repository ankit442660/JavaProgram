class A{
public A(int x)
{
    System.out.print("\n para in parent A");
    System.out.print("\n x="+x);
}
}
class B extends A
{
public B(int m,int n)
{
    super(n);
    System.out.print("\n para in child class B");
    System.out.print("\n M="+m);
    System.out.print("\n N="+n);
}
}
class C extends B{
public C(int d,int e)
{
    super(d,40);
    System.out.print("\n para in child c");
    System.out.print("\n D="+d);
    System.out.print("\n E="+e);
}
}



public class def7 {
public static void main(String args[])
{
    C c1=new C(23,43);
}
}





