import java.util.*;
class greatest
{
public static void main(String args[])
{
int a,b,c;
Scanner s1=new Scanner(System.in);
System.out.print("enter three number:");
a=s1.nextInt();
b=s1.nextInt();
c=s1.nextInt();
if(a>b)
{
if(a>c)
{
System.out.print("first is greater");
}
else
{
System.out.print("third is greter");
}
}
else if(b>c)
{
System.out.print("second is greater");
}
else
{
System.out.print("third is greater");
}
}
}
