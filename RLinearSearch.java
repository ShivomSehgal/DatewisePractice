public class RLinearSearch {                                                                             
    public static int linaer(int[] arr, int i, int x,int n){
        if(i>=n){
            return -1;
        }else{
            if(arr[i]==x){
                return i;
            }else{
                return linaer(arr, i+1, x,n);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(linaer(arr, 0, 5,9));
    }
}
