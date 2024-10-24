class formet
{
public static void main(String args[])
{
int i,j,s=3,l1=0,l=0;
System.out.print("formet printing\n");
for(i=9;i>=1;i-=2)
{
for(j=9;j<=i;j-=2)
{
System.out.print("   "+j);
}
System.out.println();
l++;
l1=l;
while(l1<=s)
{
System.out.print(" ");
l1++;
}
s=s+3;
l=l-1;
}
}
}