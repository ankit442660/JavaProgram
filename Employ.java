//wap to input 1 employ name code and salary calculate the bonus as 15% of salary find the gross //salary finally print all the information .

import java.io.*;
class Employ
{
public static void main(String args[])
{
String sname,code;
int salary;
double bonus,grosssalary;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print("enter employ name:");
sname=d1.readLine();
System.out.print("enter employ code:");
code=d1.readLine();
System.out.print("enter employ salary:");
salary=Integer.parseInt(d1.readLine());
bonus=salary*0.15;
grosssalary=salary+bonus;
System.out.print(" \n Name=" +sname);
System.out.print(" \n Code=" +code);
System.out.print(" \n Salary=" +salary);
System.out.print(" \n Bonus=" +bonus);
System.out.print(" \n Grosssalary=" +grosssalary);
}
catch(Exception e)
{
}
}
}