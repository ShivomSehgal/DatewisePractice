//Day--00
public class Doubly {
    private Node first;
    private Node last;

    public Doubly(){}

    public boolean isEmptty(){
        return first==null;
    }
    public void insertFirst(int joke){
        Node temp=new Node();
        temp.data=joke;
        if(isEmptty()){
            last=temp;
        }else{
            first.previous=temp;
        }
        temp.next=first;
        
        first=temp;
    }
    public void insertLast(int joke){
        Node temp=new Node();
        temp.data=joke;
        if(first==null){
            first=temp;
        }else{
            last.next=temp;
            temp.previous=last;            
        }
        last=temp;
    }
    public int deleteFirst(){
        int x1=first.data;
        if(first.next==null){
            last=null;
        }else{
            first.next.previous=null;
        }
        first=first.next;
        return x1;
    }

    public int deleteLast(){
        int temp=last.dta;
        if(first.next==null){
            first=null;
        }else{
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data){
        Node current=first;
        while(current.data != key){
            current=current.next;
            if(current==null){
                return false;
            }
        }
        Node temp=new Node();
        temp.data=data;
        if(current==last){
            current.next=null;
            last=temp;
        }else{
            temp.next=current.next;
            current.next.previous=temp;
        }
        temp.previos=current;
        current.next=temp;
        return true;

    }

    public Node deleteKey(int key){
        Node current=first;
        while(current.data!=key){
            current=current.next;
            if(current==null){
                return null;
            }
        }
        if(current==first){
            first=current.next;
        }else{
            current.previous.next=current.next;
            
        }
        if(current==last){
            last=current.previous;
        }else{
            current.next.previous=current.previous;
        }
        return current;
    }
    
}
