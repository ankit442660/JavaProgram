import java.util.*;
class Even
{
public static void main(String args[])
{
int x[]=new int[10];
int i;
Scanner s1=new Scanner(System.in);

for(i=0;i<10;i++)
{
System.out.print("enter no in array");
x[i]=s1.nextInt();
}
System.out.print("even no is\n");
for(i=0;i<10;i++)
{
if(x[i]%2==0)
{
System.out.println(x[i]);
 }
}
}
}