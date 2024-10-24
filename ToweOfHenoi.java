public class ToweofHenoi {
    public static void henoi(int n, String src,String helper,String dest){
        if(n==1){
            System.out.println("transfered "+ n +" from " +src+" to "+dest);
return;
        }
        //transfered  packet src to hepler n-1
        henoi((n-1), src, dest, helper);

        System.out.println("transfered "+ n +" from " +src+" to "+dest);
        //transfered packet helper to destination
        henoi((n-1), helper, src, dest);

    }
   public static void main(String[] args) {
    int n=3;
    henoi(n, "A", "B", "C");

   } 
}
