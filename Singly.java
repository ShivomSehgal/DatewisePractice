//Day--00
public class Singly {
    private Node first;

    public Singly(){
        this.first=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int x){
        Node xox=new Node();
        xox.data=x;
        xox.next=first;
        first=xox;
    }

    public void insertLast(int a){
        Node temp=first;
        while(temp.next !=null){
            temp=temp.next;

        }
        Node xox=new Node();
        xox.data=a;
        temp.next=xox;
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
