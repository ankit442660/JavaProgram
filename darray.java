import java.util.*;
class darray
{
public static void main(String args[])
{
int n[];
int i,size;
Scanner s1=new Scanner(System.in);
System.out.print("\n enter the size of array\n");
size=s1.nextInt();
n=new int[size];
for(i=0;i<size;i++)
{
System.out.print("enter no in array\n");
n[i]=s1.nextInt();
}
System.out.print("\n contents of array\n");
for(i=0;i<size;i++)
{
System.out.println(n[i]);
}
}
}