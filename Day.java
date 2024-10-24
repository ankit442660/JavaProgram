import java.util.*;
public class Day
 {
    public static void main(String args[])
    {
        int day;
        Scanner s1=new Scanner(System.in);
        System.out.print("enter day number ");
        day=s1.nextInt();
        switch(day)
        {
            case 1:
            {
                System.out.print("Day1=sunday");
                break;
            }
            case 2:
            {
                System.out.print("Day2=monday");
                break;

            }
            
            case 3:
            {
                System.out.print("Day3=tuesday");
                break;
            }
            
            case 4:
            {
                System.out.print("Day4=wednesday");
                break;
            }
            
            case 5:
            {
                System.out.print("Day5=thursday");
                break;
            }
            
            case 6:
            {
                System.out.print("Day6=friday");
                break;
            }
            
            case 7:
            {
                System.out.print("Day7=satarday");
                break;
            }
        }
    }
}
