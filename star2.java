class star2
{
public static void main(String args[])
{
int i,j,l=0,s=4,l1=0;
System.out.print("pattern printting\n");
for(i=5;i>=1;i-=2)
{
for(j=1;j<=i;j++)
{
System.out.print("*"+"   ");
}
System.out.print("\n");
l++;
l1=l;
while(l1<=s)
{
System.out.print(" ");
l1++;
}
s=s+4;
l=l-1;
}
}
}