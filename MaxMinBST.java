//find the maximum/ minimum in a Binary Search Tree
public class MaxMinBST {

    public int[] maxmin(){
        //Assuming root is neither max nor min i.e it is a BST
        Node maxi=root;
        Node mini=root;
        int[] arr=new int[1];//generate an array to print the max and min values
        while(maxi.rightchild!=null){//find the rightmost child node of BST
            maxi=maxi.rightchild;
            
        }
        arr[0]=maxi.key;
        while(maxi.leftchild!=null){//Find the leftmost child node of BST
            mini=mini.leftchild;
            
        }
        arr[1]=mini.key;
        return arr;//return the array containing maximum and minimum values.
    }
    
}
