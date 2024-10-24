//wap to input ten number in an array and search any particular number
import java.util.*;
class searcharray
{
public static void main(String args[])
{
int n[]=new int[10];
int i,num,found=0,pos=0;
Scanner s1=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.print("\n enter no in array\n");
n[i]=s1.nextInt();
}
System.out.print("\n enter number\n");
num=s1.nextInt();
for(i=0;i<10;i++)
{
if(n[i]==num)
{
found=1;
pos=i;
break;
}
}
++pos;
if(found==1)
{
System.out.print("number exist on position"+pos);
}
else
{
System.out.print("number does not exist");
}
}
}