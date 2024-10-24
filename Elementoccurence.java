public class Elementoccurence {
    public static int first=-1;
    public static int last=-1;

    public static void occurence(String str,char el,int index){
        if(str.length()==index){
            return;
        }
       char currchar=str.charAt(index);
       if(currchar==el){
        if(first== -1){
            first=index;
        }else{
            last=index;
        }
       }
       occurence(str, el, index+1);
    }
    public static void main(String[] args) {
        String x = "naamdkjdkdkaanna";
        occurence(x, 'a',0);
        System.out.println("First occurence of index " +first);
        System.out.println("Last occurence of index " +last);

    }
}
