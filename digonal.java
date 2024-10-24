import java.util.*;
class digonal
{
    public static void main(String args[])
    {
        int n[][]=new int[3][3];
        int i,j,ls=0,rs=0;
        Scanner s1=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\n enter no in array\n");
                n[i][j]=s1.nextInt();
            }
        }
//left sum
j=0;
for(i=0;i<3;i++)
{
    ls=ls+n[i][j];
    j++;
}
//right sum
j=2;
for(i=0;i<3;i++)
{
    rs=rs+n[i][j];
    j--;
}
System.out.print("Left sum="+ls);
System.out.print("right sum="+rs);
    }
}