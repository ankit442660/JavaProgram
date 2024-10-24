// wap to input two number and add them

import java.io.*;
class Sum2
{

public static void main(String args[]) throws IOException
{
int a,b,c;
InputStreamReader i1=new InputStreamReader(System.in);
BufferedReader b1=new BufferedReader(i1);
System.out.print("enter first number:");

a=Integer.parseInt(b1.readLine());
System.out.print("enter second number:");
b=Integer.parseInt(b1.readLine());
c=a+b;
System.out.print("Sum="+c);
}
}