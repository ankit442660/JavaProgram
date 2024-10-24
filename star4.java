public class star4 {
    public static void main(String args[])
    {
        int l1=0,s=4,i,j,k=0;
        for(i=0;i<5;i++)
        {
            for(j=9-k;j>0;j-=2)
            {

            System.out.print("   "+j);
            }
        
            for(j=3;j<10-k;j+=2)
           {
           System.out.print("   "+j);
            }
    System.out.println();
    k=k+2;
    l1=0;
           while(l1<s)
           {
            System.out.print(" ");
            l1=l1+1;
           }
           s=s+4; 
        }
       
    }
    
}
