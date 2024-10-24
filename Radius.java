//wap to input the radius of a circle from command line and find the area
   

   class Radius
{
public static void main(String args[])
{
double r,area;
r=Double.valueOf(args[0]).doubleValue();
area=3.14*r*r;
System.out.print("Area="+area);
}
}