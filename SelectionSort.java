import java.util.Arrays;

public class SelectionSort {
    public static int[] selection(int[] arr, int n){
        for(int i=0;i<n;i++){
            int mini=i;
            for(int j=0;j<n;j++){
                if(arr[mini]<arr[j]){
                    mini=j;
                }
                int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
            }
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(selection(arr,9)));
    }
}
