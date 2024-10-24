import java.util.*;
public class String1 {
    public static void main(String args[])
    {
       
        
    //   Scanner s1=new Scanner(System.in);
    //   System.out.println("enter String:-");
    //   String name= s1.next();
    //   System.out.println(name);
           
      String firstName="Tony";
      String secondName="stark";
  //concatenation
      String fullName= firstName + " " +secondName;
    //   System.out.println(fullName);
    // //   length
    // System.out.println(fullName.length());

    // Access characters of a string
   
     if(firstName.equals(secondName))
     {
        System.out.println("they are the same string");
     }
     else
     {
        System.out.println("they are diffrent string");
     }
    // substring
    System.out.println(fullName.substring(5,fullName.length()));
}
}