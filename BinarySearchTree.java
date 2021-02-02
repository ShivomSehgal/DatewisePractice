public class BinarySearchTree {
    private Node root;
    
        
    public void insert(int key, String name){
        Node x1=new Node(key,name);
        if(root==null){
            root=x1;
        }else{
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                if(key<current.key){
                    current=current.leftchild;
                    if(current==null){
                        parent.leftchild=x1;
                        return;
                    }
                }else{
                    current=current.rightchild;
                    if(current==null){
                        parent.rightchild=x1;
                        return;
                    }
                }
            }
        }
    }

    public Node findmin(){
        Node current=root;
        Node last=current;
        while(current!=null){
            last=current;
            current=current.leftchild;
        }
        return last;
    }

    public Node findmax(){
        Node current=root;
        Node last=current;
        while(current!=null){
            last=current;
            current=current.rightchild;
        }
        return last;
    }

    public boolean remove(int key){
        Node current=root;
        Node parent=root;

        boolean isLeftchild = false;

        while(current.key!=key){
            parent=current;
            if(current.key>key){
                current=current.leftchild;
                isLeftchild=true;
            }else if(current.key<key){
                current=current.rightchild;
                isLeftchild=false;
            }else if(current==null){
                return false;
            }
        }
        Node nodetodelete=current;
        //if nodetodelete is a leaf node
        if(nodetodelete.leftchild==null&& nodetodelete.rightchild==null){
            if(nodetodelete==root){
                root=null;
            }else if(isLeftchild){
                parent.leftchild=null;
            }else {
                parent.rightchild=null;
            }
        }
        //if it has one child and it is on the left
        if(nodetodelete.rightchild==null){
            if(nodetodelete==root){
                root=nodetodelete.leftchild;
            }else if(isLeftchild){
                parent.leftchild=nodetodelete.leftchild;
            }else{
                parent.rightchild=nodetodelete.leftchild;
            }
        }
        //if nodetodelete has one child on the right
        if(nodetodelete.leftchild==null){
            if(nodetodelete==root){
                root=nodetodelete.rightchild;
            }else if(isLeftchild){
                parent.leftchild=nodetodelete.rightchild;
            }else{
                parent.rightchild=nodetodelete.rightchild;
            }
        }
        //has two child nodes
        else{
            Node successor=getSuccessor(nodetodelete);
            if(nodetodelete==root){
                root=successor;
            }else if(isLeftchild){
                parent.leftchild=successor;
            }else{
                parent.rightchild=successor;
            }
            successor.leftchild=nodetodelete.leftchild;
        }
        return true;

    }

    
    public Node getSuccessor(Node nodetodelete){
        Node sp=nodetodelete;
        Node successor=nodetodelete;

        Node current=nodetodelete.rightchild;
        while(current !=null){
            sp=successor;
            successor=current;
            current=current.leftchild;
        }
        if(successor!=nodetodelete.rightchild){
            sp.leftchild=successor.rightchild;
            successor.rightchild=nodetodelete.rightchild;
        }
        return successor;
    }
}
