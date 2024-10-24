class Copy
{
    private int x;
    public Copy(int n)
    {
        x=n;
    }
    public Copy(Copy p1,Copy p2)
    {
        x=p1.x+p2.x;
    

    }
public void show()
{
    System.out.print("\n x="+x);
}
}


public class CopyMain {
    public static void main(String args[])
    {
        Copy obj1=new Copy(10);
        Copy obj2=new Copy(20);
        Copy obj3=new Copy(obj1,obj2);
        obj1.show();
        obj2.show();
        obj3.show();
    }
    
}
