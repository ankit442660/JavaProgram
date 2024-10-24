
class prime
{
public static void main(String args[])
{
int i,j,n=0;
for(i=2;i<=50;i++)
{
for(j=2;j<=i/2;j++)
{
if(i%j==0)
n=n+1;
}

if(n==0)
{
System.out.print("\n prime="+i);
}
else
{
System.out.print("\n not prime="+i);
}
n=0;
}

}
}