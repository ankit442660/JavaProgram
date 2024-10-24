interface A
{
    public void f1();
}
// 1 and 2
/*interface B
{
    public void f2();
}*/
//1st
/*interface C extends A,B{
    public void f3();
}
class P implements C{
    public void f1()
    {
        System.out.print("\n method of A");
    }
    public void f2()
    {
        System.out.print(" \n method of B");
    }
    public void f3()
    {
        System.out.print(" \n method of C");
    }
    //2nd
}*/
/*class P implements A,B{
    public void f1()
    {
        System.out.print("method of A:- \n");
    }
    public void f2()
    {
        System.out.print( "method of B:-\n");
        
    }
}*/
//3rd
class B 
{
    public void f2()
    
    {
        
    }
}
class P extends B implements A
{
public void f1()
{
    System.out.print("method of A:");

}
public void f2()
{
    System.out.print("\n method of B:");
}
    
}
 public class multiple {
    public static void main(String args[])
    {
        P p1=new P();
        p1.f1();
        p1.f2();
       // p1.f3();
    }
}
