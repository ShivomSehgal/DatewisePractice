//Day--00

public class Circular {
    private Node first;
    private Node last;

    public Circular(){
        this.first=null;
        this.last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void Insertfirst(int x1){
        Node current =new Node();
        current.data=x1;
        if(isEmpty()){
            last=current;
        }
        current.next=first;
        first=current;
    }
    public int deleteFirst(){
        int temp=first.data;
        if(first.next==null){
            last=null;
        }
        first=first.next;
        return temp;
    }
    public void insertLast(int j){
        Node temp=new Node();
        temp.data=j;
        if(first==null){
            first=temp;
        }else{
        last.next=temp;
        last=temp;
    }
}
public void displayList(){
    Node current=first;
    while(current !=null){
        current.print();
        current=current.next;
    }
    System.out.println();
}

}
