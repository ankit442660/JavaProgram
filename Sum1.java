//wap to sum of two number using keyboard input


import java.io.*;
class Sum1
{
public static void main(String args[])
{
int a,b,c;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print("enter first no:");
a=Integer.parseInt(d1.readLine());
System.out.print("enter second no:");
b=Integer.parseInt(d1.readLine());
c=a+b;
System.out.print("\n sum="+c);
}
catch(Exception e)
{
}
}
}