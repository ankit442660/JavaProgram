public class LastPlaceX {
    public static void addX(String str,int index,int count,String subString){
        if(index==str.length()){
for(int i=0;i<count;i++){
    subString+='x';
}
System.out.println(subString);
            return;
        }
char currchar=str.charAt(index);
        if(currchar=='x'){
            count+=1;
            addX(str, index+1, count, subString);
        }else{
            subString+=currchar;
            addX(str, index+1, count, subString);
        }
    }
    public static void main(String[] args) {
        String str="axbxcxd";
        addX(str, 0, 0, " ");

    }
}
