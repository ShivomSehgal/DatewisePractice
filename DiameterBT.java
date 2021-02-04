
//find the diameter of Binary tree with root
public class DiameterBT {
    public int diameter(){
        
        TreeNode currentl=root.leftchild;//initilize two instance treenodes for left traversal 
        TreeNode currentr=root.rightchild;//and right traversal
        int templ=1,tempr=1;//initilize the counters for both the instance nodes
        while(isleaf(currentl)){//till it reaches its final leaf node of left half of binary tree
            if((isleaf(currentl.leftchild)|| currentl.leftchild==null)&& !isleaf(currentl.rightchild)){//tricky yet logical condition
                currentl=curentl.rightchild;
                templ++;
            }else{
                currentl=currentl.leftchild;
                templ++;
            }
            //at this point we got the value of number of nodes till leaf node in left half
                     
        }
        while(isleaf(currentr)){//now for the right half
            if((isleaf(currentr.leftchild)||currentr.rightchild==null)&& !isleaf(currentr.rightchild)){
                currentr=curentr.rightchild;
                temp++;
            }else{
                currentr=currentr.leftchild;
                temp++;
            }
            //got the value of right half traversal         
        }
        int temp=templ+tempr+1;// +1 bcause we need to count the root node also
        return temp;
             
        }
        public boolean isleaf(TreeNode parent){//function to determine if a node inserted is a leaf node or not
            if(parent.leftchild==null && parent.rightchild==null){
                return true;
            }else{
                return false;
            }
        }
    
}
