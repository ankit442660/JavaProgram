//wap to input 1student name, roll no, course, fee, and gender from command line finally print all //the information

import java.lang.*;

class Student {
  public static void main(String args[]) {
    String Sname, course;
    int roll;
    float fee;
    char gender;

    Sname = args[0];
    roll = Integer.parseInt(args[1]);
    fee = Float.valueOf(args[2]).floatValue();
    course = args[3];
    gender = args[4].charAt(0);
    System.out.print("\nName=" + Sname);
    System.out.print("\nRoll=" + roll);
    System.out.print("\nFee=" + fee);
    System.out.print("\nCourse=" + course);
    System.out.print("\nGender=" + gender);
  }
}