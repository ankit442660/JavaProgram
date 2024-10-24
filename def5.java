class A{
    public A(int x)
    {
        System.out.print("\n para in parent a");
        System.out.print("\n X="+x);
    }
}
class B extends A
{
    public B(int m,int n)
    {
        super(n);
        System.out.print("\n para in child B");
        System.out.print("\n m="+m);
        System.out.print("\n N="+n);
    }
}






public class def5 {
    public static void main(String args[])
    {
        B b1=new B(13,123);
    }
}
