import java.util.*;
class Circle
{ 
    private int r;
    private float ar;
    Scanner s1=new Scanner(System.in);
    public void area()
{
    
    System.out.print("\n enter the radius:-");
    r=s1.nextInt();
    ar=3.14f*r*r;
    System.out.print("\n AREA=" +ar);
}
}
class CircleMain
{
    public static void main(String args[])
    {
        Circle c1=new Circle();
        c1.area();
    }
}