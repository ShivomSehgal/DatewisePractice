import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        quick(0,8,arr);
        System.out.println(Arrays.toString(arr));        
    }

    public static void quick(int p, int r, int[] arr){
        if(p>=r){
            return;
        }else{
            int q=partion(arr,p,r);
            quick(p, q-1, arr);
            quick(q+1, r, arr);
        }
    }
    public static int partion(int[] arr, int p, int r){
        int pivot=arr[r];
        int j=p-1;
        for(int i=p;i<=r-1;i++){
            if(arr[i]<=pivot){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
            int temp=arr[j+1];
            arr[r]=temp;
            arr[j+1]=pivot;
        
        return j+1;
    }
}
