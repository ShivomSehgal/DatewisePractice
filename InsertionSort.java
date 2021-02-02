import java.util.Arrays;

public class InsertionSort {
    public static int[] insertion(int[] arr, int n){
        for(int i=1;i<n;i++){
            int element=arr[i];
            int j=i-1;
            while(arr[j]>element && j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(insertion(arr, 9)));
    }
}
