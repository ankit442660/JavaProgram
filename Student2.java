//wap to input 1 student details name, roll, fee,and course and print them

import java.util.*;
class Student2
{
public static void main(String args[])
{
String sname,course;
int roll;
float fee;
Scanner s1=new Scanner(System.in);
System.out.print("enter name");
sname=s1.nextLine();
System.out.print("enter course");
course=s1.nextLine();
System.out.print("enter roll");
roll=s1.nextInt();
System.out.print("enter fee:");
fee=s1.nextFloat();
System.out.print("\n Name="+sname);
System.out.print("\n Course="+course);
System.out.print("\n Roll="+roll);
System.out.print("\n Fee="+fee);
}
}