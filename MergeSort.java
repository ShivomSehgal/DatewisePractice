import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        mergesort(arr,0,8);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr, int p, int r){
        if(p>=r){
            return;
        }else{
            int q=(p+r)/2;
            mergesort(arr, p, q);
            mergesort(arr, q+1, r);
            merge(arr,p,q,r);
        }
    }
    public static void merge(int[] arr, int p, int q, int r){
        int[] temp=new int[r-p+1];
        int k=0;
        int ls=p;
        int rs=q+1;
        while(ls<=q && rs<=r){
            if(arr[ls]<arr[rs]){
                temp[k]=arr[ls];
                ls++;
            }else{
                temp[k]=arr[rs];
                rs++;
            }
            k++;
        }
            if(ls<=q){
                while(ls<=q){
                    temp[k]=arr[ls];
                    k++;
                    ls++;
                }
            }else if(rs<=r){
                while(rs<=r){
                    temp[k]=arr[rs];
                    rs++;
                    k++;
                }
            }
            for(int i=0;i<temp.length;i++){
                arr[p+i]=temp[i];
            }
        
    }
}
