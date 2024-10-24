import java.util.Arrays;

public class MathematicsForCp {

    public static void main(String[] args) {
        // Boolean isArry[] = prime(20);
        // for (int i=0; i<=20; i++){
        //     if(isArry[i]==true){
        //         System.out.println(i);
        //     }
            
        // }

        System.out.println(path(3,3));
    //    System.out.println(GCD(45,9)); 
    }
    // static int GCD(int a , int b){
    //     if(b==0) return a;
    //     return GCD(b ,a%b);
    // }


    static int path(int m ,int n){
        if(m==1 || n==1){
            return 1;
        }
        return path(m-1 ,n)+path(n-1,m);
    }
static int factorial(int m,int n){
    int res=1;
    while (n>0) {
        
    
        if((n&1)!=0){
            res =res*m;
        }
        m=m*m;
        n=n>>1;
        
    }
    return res;
}
    static Boolean[] prime(int n ){
        Boolean isArray[] =new Boolean[n+1];
        Arrays.fill(isArray, true);
        isArray[0] =false;
        isArray[1]=false;
        for (int i=2;i*i<=n;i++){
            for (int j=i*2; j<=n;j=j+i){
                isArray[j]=false;
            }
        }

        return isArray;
    }
}
