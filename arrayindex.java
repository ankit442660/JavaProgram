public class arrayindex {
    public static boolean array(int arr[],int index){
        if(index==(arr.length-1)){
            return true;
        }
        if(arr[index] >= arr[index+1]){
            return false;
              }
   return array(arr, index+1);
    }
    public static void main(String[] args) {
       int arr1[] = {1,2,6,5,7};
       System.out.println(array(arr1,0));
    }
}
