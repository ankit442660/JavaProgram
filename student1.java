//wap to input student name and marks of 3 subject from command   line calculate total marks and  //percentage.

import java.lang.*;

class student1 {
    public static void main(String args[]) {
        String sname;
        int marks1, marks2, marks3, totalmarks;
        float per;
        sname = args[0];
        marks1 = Integer.parseInt(args[1]);
        marks2 = Integer.parseInt(args[2]);
        marks3 = Integer.parseInt(args[3]);
        totalmarks = marks1 + marks2 + marks3;
        per = totalmarks / 3;
        System.out.print("\n Name=" + sname);
        System.out.print("\n sub1=" + marks1);
        System.out.print("\n sub2=" + marks2);
        System.out.print("\n sub3=" + marks3);
        System.out.print("\n Totalmark=" + totalmarks);
        System.out.print("\n Percentage=" + per);
    }
}
