public class subsequence {
    public static String  sequence(String str,int idx, String comString){
        if(idx==str.length()){
        System.out.println(comString);
            return comString;
        }
       
       return sequence(str, idx+1, comString+str.charAt(idx)) + sequence(str, idx+1, comString);
        

    
    }
   public static void main(String[] args) {
    sequence("abc", 0, "");

   } 
}
