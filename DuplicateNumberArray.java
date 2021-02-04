public class DuplicateNumberArray {
    public static void main(String[] args) {
    int[] arr={3,1,3,4,2};  
    System.out.println(duplicatee(arr));  
    }
    public static int duplicatee(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[j];
                }
            }
        }
        return -1;
    }

}
