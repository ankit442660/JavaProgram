import java.util.*;
class DDA1
{
    public static void main(String args[])
    {
        int n[][]=new int[3][3];
        int i,j;
        Scanner s1=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("enter no in array\n");
                n[i][j]=s1.nextInt();
            }
        }
        System.out.print("contents of DDA \n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]+"  ");
            }   
            System.out.println();
        }
   
    }
}