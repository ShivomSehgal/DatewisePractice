public class RBinarySearch {
    public static int binary(int[] arr, int x, int n, int p, int r){
        if(p>r){
            return -1;
        }else{
            int q=(p+r)/2;
            if(arr[q]==x){
                return q;
            }else if(arr[q]>x){
                return binary(arr, x, n, p,q-1);
            }
            else if(arr[q]<x){
                return binary(arr, x, n,q+1, r);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binary(arr, 6, 9, 0, 8));
    }
    
}
