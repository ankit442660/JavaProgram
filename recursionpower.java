public class recursionpower {
public static int power(int x,int n){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }
    
    if((n & 1)==0) {
         return  power(x,n/2)* power(x, n/2) ;
    }
    else{
         return power(x,n/2)*power(x, n/2)*x ;

    }
    
}
    public static void main(String[] args) {
    System.out.println(power(2,6)); 
    }
}