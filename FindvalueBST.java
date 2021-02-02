//Solution for finding a value in a Binary Search Tree
public class FindvalueBST {
    public boolean findvalue(int key){
        Node current=root;//generate an instance node current and initilize it with value of root node
                 
        while(current!=null){//generate a while loop till current==null
            if(current.key==key){return true;}
            else if(key < current.key){
                current=current.leftchild;//traverse to left half of the BST if key has value less than current node value
            }else{
                current=current.rightchild;//else traverse to the right half             
            }
        }
        return false;//if value was not found in the BST
    }
}
