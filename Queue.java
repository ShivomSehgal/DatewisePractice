//Day--0
//data structure practice

public class Queue {
    private int maxsize;
    private int[] queuearray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int j){
        this.maxsize=j;
        this.queuearray=new int[j];
        this.front=0;
        this.rear=-1;
        this.nItems=0;
    }

    public boolean isEmpty(){
        return nItems==0;
    }
    public boolean isFull(){
        return nItems==maxsize;
    }
    public int peekFront(){
        return queuearray[front];
    }
    public void insert(int j){
        rear++;
        nItems++;
        queuearray[rear]=j;
    }
    public int delete(){
        front++;
        return queuearray[front];
        nItems--;
    }
}
