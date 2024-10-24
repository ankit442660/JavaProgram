import java.util.*;
class Reverse
{
public static void main(String args[])
{
int x[]=new int[10];
int i,num,r,a;
Scanner s1=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.print("enter no in array\n");
x[i]=s1.nextInt();
}
System.out.print("\n Number\t\t\tReverse\n");
for(i=0;i<10;i++)
{
num=x[i];
r=0;
while(num>0)
{
a=num%10;
r=r*10+a;
num=num/10;
}
System.out.println(x[i]+"\t\t\t"+r);
}
}
}
