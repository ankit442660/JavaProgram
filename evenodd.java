 //wap to print all even and odd number in tabuler formet from 1to 20 also count all even and odd //number also sum alleven and odd number sepreatly

class evenodd
{
public static void main(String args[])
{
int ne=0,no=0,se=0,so=0,a;
System.out.print("even\t\t\t odd\n");
for(a=1;a<=20;a++)
{
if(a%2==0)
{
System.out.println(a);
ne=ne+1;
se=se+a;
}
else
{
System.out.println("\t\t\t"+a);
no=no+1;
so=so+a;
}
}
System.out.print("\n No of even="+ne);
System.out.print("\n sum of even="+se);
System.out.print("\n No of odd="+no);
System.out.print("\n sum of odd="+so);
}
}
