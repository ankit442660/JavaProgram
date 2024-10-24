class implement
{
    private int x;
    public implement(int n)
    {
x=n;
    }
    public implement (implement p)
    {
        x=p.x;
    }
    public void show()
    {
        System.out.print("\n X="+x);
    }
}

public class implementMain {
    public static void main(String args[])
    {
implement p1=new implement(10);
implement p2=new implement(p1);
p1.show();
p2.show();

    }
    
}
