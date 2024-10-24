import java.util.*;

public class Arraytable {
  public static void main(String args[])  
  {
    int n[]=new int[10];
    int t,i,num;
    int j=0;
    Scanner s1=new Scanner(System.in);
    System.out.print("enter a number");
    num=s1.nextInt();

    for(i=1;i<=10;i++)
    {
        t=num*i;
        n[j]=t;
        j++;
    }
    System.out.print("content of an array is \n");
    for(i=0;i<10;i++)
    {
        System.out.println(n[i]);
    }
  }
}
