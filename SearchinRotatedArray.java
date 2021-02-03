import java.util.Arrays;

//Search for the index of an element in a rotated array
public class SearchinRotatedArray {
   public static void main(String[] args) {//generate the driver method
       int[] arr={7,8,9,1,2,3,4,5,6};
       int n=arr.length;
       System.out.println(rotated(arr,n,5));
   }
   
   public static int rotated(int[] arr, int n, int x){//create a method which takes input arguments int array, length of the int array and the element we need to find
       if(n==0){//if array has no value return -1
           return -1;
       }else{
           int rot=0;//create a variable which we will use to find the index position where rotation has ended
           for(int i=0;i<n-1;i++){
               if(arr[i]>arr[i+1]){
                   rot=i+1;//found the position
               }
           }
           
               if(arr[n-1]==x){//get the value of the last value in the array
                   return n-1;
               }else if(arr[n-1]>x){//now if the value is smaller than arr[n-1], traverse from rot till n-2
                for(int j=rot;j<n-1;j++){
                    if(arr[j]==x){
                        return j;
                    }
                }
               }else if(arr[n-1]<x){//if the value is greater than arr[n-1], traverse from 0 till rot-1
                   for(int i=0;i<rot;i++){
                       if(arr[i]==x){
                           return i;
                       }
                   }
               }
           
       }
       return -1; //if no value is found till this point, return -1 which implies that no such value was in the rotated array
   }
}
