import java.util.HashSet;

public class duplicatenotallow {
    public static void hashset(String str,int idx,String string ,HashSet<String> allsubesq){
        if(idx==str.length()){
            if(allsubesq.contains(string)){
                return;
            }
            allsubesq.add(string);
            System.out.println(string);
            return;

        }
        hashset(str, idx+1, string+str.charAt(idx), allsubesq);
        hashset(str, idx+1, string, allsubesq);

    }
    public static void main(String[] args) {
        String srt1="aaa";
        HashSet<String> allsubseq=new HashSet<>();
        hashset(srt1, 0, "", allsubseq);
    }
}
