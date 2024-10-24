import java.util.*;
class addition
{
    public static void main(String args[])
    {
        int n[][]=new int[3][3];
        int m[][]=new int[3][3];
        int x[][]=new int[3][3];
        int i,j;
        Scanner s1=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            System.out.print("ENeter no in array \n");
          
          n[i][j]=s1.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            System.out.print("enter sec no in array \n ");
          
          m[i][j]=s1.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            x[i][j]=n[i][j]+m[i][j];
            }
        }
        System.out.print("\n addition of matrix is \n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            System.out.print("   "+x[i][j]);
            }
            System.out.println();
        }
    }
}