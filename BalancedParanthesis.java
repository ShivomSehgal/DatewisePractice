import java.util.*;
public class BalancedParanthesis {
    public static void main(String[] args) {
        String str="[[]]";
        System.out.println(checkh(str));
    }

    public static boolean checkh(String str){
       Stack <Character> st=new Stack();
       char[] arr=str.toCharArray();
       if(arr.length%2!=0){
           return false;
       }
       char[] arr1=new char[arr.length];
       for(int i=0;i<arr.length;i++){
           st.push(arr[i]);
       } 
       for(int i=0;i<arr.length;i++){
           arr1[i]=st.pop();
       }
       for(int i=0;i<arr.length;i++){
       if(arr[i]=='{' && arr1[i]=='}'){
           return true;
       }else if(arr[i]=='['&& arr1[i]==']'){
           return true;
       }else if(arr[i]=='('&& arr1[i]==')'){
           return true;
       }
    }
       return false;
    }
}
