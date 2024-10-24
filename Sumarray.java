// wap to input to array and sum them first block into last block sequencally 
import java.util.*;  
class Sumarray
{
public static void main(String args[])
{
int x[]=new int[10];
int y[]=new int[10];
int sum[]=new int[10];
int i;
Scanner s1=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.print("enter no in array\n");
x[i]=s1.nextInt();
}
for(i=0;i<10;i++)
{
System.out.print("enter sec no in array\n");
y[i]=s1.nextInt();
}
System.out.print("sum=\n");
for(i=0;i<10;i++)
{
sum[i]=x[i]+y[9-i];
System.out.println(sum[i]);
}
}
}

