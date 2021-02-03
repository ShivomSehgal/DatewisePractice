import java.util.Arrays;

//find the pair with given difference in the array else return -1
public class PairwithDifference {
    public static void main(String[] args) {//generate the driver class
        int[] arr={7,8,9,2,15,80};
        int n=arr.length-1;
        System.out.println(Arrays.toString(pairr(arr, n,78)));
    }

    public static int[] pairr(int[] arr, int n, int x){//generate the method to find the pair
        int[] abc=new int[2];//generate an array to print the output pair
        for(int i=n;i>=0;i--){//traverse from the end of the array from i pointer
            for(int j=0;j<=n;j++){// traverse from the first and check if the difference is the required difference
                if(arr[i]-arr[j]==x){
                    abc[0]=arr[i];
                    abc[1]=arr[j];
                }
            }
        }
        return abc;//return the array containing the pair
    }
    
}
