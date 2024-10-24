import java.util.Scanner;

public class Traling {
    public static void main(String args[]){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Number To find Traling Zero:-");
        int a=s1.nextInt();
        int res=0;
        for(int i=5;i<=a;i=i*5){
             res=res+(a/i);
        }
        System.out.println("The number of Traling zero is =" +res);
    }
    
}
