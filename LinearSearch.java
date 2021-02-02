public class LinearSearch {
    public static int linearSearch(int[] arr, int x, int n){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={12,36,15,89,865,454};
        System.out.println(linearSearch(arr, 454, 6));
    }
}
