//wap to input two number and print their sum if first is greater than second otherwise swap them 
//and then print their subtraction


import java.util.*;
class Swap
{
public static void main(String args[])
{
int a,b,c,t,u;
Scanner s1=new Scanner(System.in);
System.out.print("enter first number:");
a=s1.nextInt();
System.out.print("enter second number:");
b=s1.nextInt();
if(a>b)
{
c=a+b;
System.out.print("sum=" +c);
}
else
{
t=b;
b=a;
a=t;
u=a-b;
System.out.print("subtraction=" +u);
}
}
}