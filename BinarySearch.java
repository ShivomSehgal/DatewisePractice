public class BinarySearch {
    public static int binarysearch(int[] arr, int x, int n){
        int p=0;
        int r=n-1;
        while(p<=r){
            int q=(p+r)/2;
            if(arr[q]==x){
                return q;
            }else if(arr[q]>x){
                r=q-1;
            }else if(arr[q]<x){
                p=q+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,45,67};
        System.out.println(binarysearch(arr, 4, 5));
    }
    
}
