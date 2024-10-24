public class reversestring {
    public static void string(String str,int index ,String newString){
        if(str.length()==index){
        
            return;
        }

string(str, index+1, newString);
char currchar=str.charAt(index);
System.out.println(currchar);
    }
    public static void main(String[] args) {
        String x="aabbnabah";
        string(x, 0, " ");
    }
}
