// wap to input a number and find its factorial

import java.util.*;
class factorial
{
public static void main(String args[])
{
int num,i,fact=1;
Scanner s1=new Scanner(System.in);
System.out.print("enter a number:");
num=s1.nextInt();
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.print("factorial="+fact);
}
}