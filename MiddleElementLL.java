//find the middle element of LL and if there are two middle elements, print second one 
public class MiddleElementLL {
    ListNode first;

    class ListNode{//initilize the listnode class
        int data;
        ListNode next;
        
    }
    public void insert(int data){//create an insert function to add elements to the list
        ListNode current=new ListNode();
        current.data=data;
        current.next=first;//i made this a reverse ll on purpose because order of the elements was not important to me
        first=current;
    }


        public void middleLL(){
        ListNode current=first;//initilize a node and set it to first
        int temp=1;// init a temp int variable
        while(current.next != null){//traverse till the last node
            current=current.next;
            temp++;//this will get the length of the linkedList
        }
        if(temp%2==0){//if list is even
            temp=(temp+2)/2;//follow the formula for even list: (n+2)2
        }
        else{
            temp=(temp+1)/2;// formula (n+1)/2
        }
        ListNode abc=first;
        while(temp!=1){
            abc=abc.next;
            temp--;
        }
        System.out.println(abc.data);
    }
    
}
