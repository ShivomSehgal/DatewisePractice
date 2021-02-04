//find quadruple that have sum equal to given number
public class Quadruple {
    public static void main(String[] args) {
        int[] arr={10,2,3,4,5,7,8};
        quad(arr,arr.length,23);
    }
    public static void quad(int[] arr, int n, int m){
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                    if(arr[i]+arr[j]+arr[k]+arr[l]==m && arr[i]!=arr[j]&&arr[i]!=arr[k] && arr[i]!=arr[l]&& arr[j]!=arr[k]&&arr[j]!=arr[l]&&arr[k]!=arr[l]){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]+" $");
                    }
                }
            }
            }
        }
    }
}
