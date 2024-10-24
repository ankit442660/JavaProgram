//wap to input 10 nimber in an array  and print
 import java.util.*;
class Array1
{
public static void main(String args[])
{
int n[]=new int[10];
int i;
Scanner s1=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.print("\n enter no of array");
n[i]=s1.nextInt();
}
System.out.print("\n contents of array:-\n");
for(i=0;i<9;i++)
{
System.out.println(n[i]);
}
}
}