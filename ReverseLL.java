//Reverse a Singly Linked List
public class ReverseLL {

    class ListNode{//create a ListNode class
        public int data;
        public ListNode next;

        public void print(){//create a display function
            System.out.println("--> "+data+" <--");
        }
    }
    ListNode first;//initilize the first node as null

    public ReverseLL(){}//the nodes are predefined as null, so no need for comparator

    public void insert(int data){//here lies the trick to tackle the problem
        ListNode current=new ListNode();//create a new node
        current.data=data;//insert value to the node
        current.next=first;//now, instead of making it next refrence to first node
        first=current;// make this node the first node and set its next pointer to first node
        
    }
    public void DisplayList(){//ordinary function to display list
        ListNode current=first;
        while(current!=null){
            current.print();
            current=current.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        ReverseLL obb=new ReverseLL();
    obb.insert(1);
    obb.insert(2);
    obb.insert(3);
    obb.insert(4);
    obb.DisplayList();
    }
    
}
