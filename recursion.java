public class recursion {
    public static void printnum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
public static void printnum1(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printnum1(n-1);
}
    public static void main(String[] args) {
        // printnum(1);
        printnum1(5);
    }
    
}
