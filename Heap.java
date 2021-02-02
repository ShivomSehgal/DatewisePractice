public class Heap {
    class Node{
        int key;

        public Node(int key){
            super();
            this.key=key;
        }
        public void setKey(int key){
            this.key=key;
        }
        public int getKey(){
            return key;
        }
    }

    public Node[] heaparray;
    public int maxsize;
    public int currentsize;

    public Heap(int k){
        this.maxsize=k;
        this.currentsize=0;
        this.heaparray=new Node[maxsize];
    }
    public boolean isEmpty(){
        return currentsize==0;
    }
    public int getSize(){
        return currentsize;
    }

    public boolean insert(int key){
        if(currentsize==maxsize){
            return false;
        }
        Node newnode=new Node(key);
        heaparray[currentsize]=newnode;
        trickleup(currentsize);
        currentsize++;
    }
    public Node delete(){
        Node root=heaparray[0];
        currentsize--;
        heaparray[0]=heaparray[currentsize];
        
        trickledown(0);
        
        return root;
    }
    public void trickleup(int id){
        int pid=(id-1)/2;
        Node nodetoinsert=heaparray[id];
        while(id>0 && heaparray[pid].getKey()<nodetoinsert.getKey()){
            heaparray[id]=heaparray[pid];
            id=pid;
            pid=(pid-1)/2;
        }
        heaparray[id]=nodetoinsert;
    }
    public void Trickledown(int id){
        int largerchild;
        Node top=heaparray[id];

        while(id<currentsize/2){
            int lc=2*id+1;
            int rc=lc+1;
            if(rc<currentsize && heaparray[lc].getKey()<heaparray[rc].getKey()){
                largerchild=rc;
            }else{
                largerchild=lc;
            }
            if(top.getKey()>=heaparray[largerchild].getKey()){
                break;
            }
            heaparray[id]=heaparray[largerchild];
            id=largerchild;
        }
        heaparray[id]=top;
    }
}
