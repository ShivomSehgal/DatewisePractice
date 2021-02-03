//remove duplicates from a singly linked list
//hot question
public class RemoveDuplicatesLL {

    public void removedup(){
        
     
        ListNode current=first.next;//initilize the current node to next of first node
        ListNode parent=first;// parent node to first node
         
       
            while(current!=null){//base condition
         
         
            if(current.data==parent.data){
                 current=current.next; //dont just move parent node yet, instead traverse till current.data!=parent.data
            }else{
                parent.next=current;//then change the values of current node and parent node
                parent=parent.next;
                current=current.next;
            }
            
            
         
          
            
         }
         parent.next=current;//to check the last node value to its previous node
                parent=parent.next;
 
        }
   
    
}
