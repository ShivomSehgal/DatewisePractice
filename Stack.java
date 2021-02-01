//Started a series of revising implementation of data structures and algorithms
//Day--01

public class Stack {
    private int maxsize;
    private int[] stackarray;
    private int top;
    
    public Stack(int j){
        this.maxsize=j;
        this.stackarray=new int[maxsize];
        this.top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxsize-;
    }
    public void push(int x){
        top++;
        stackarray[top]=x;
    }
    public int pop(){
        int temp=top;
        top--;
        return stackarray[temp];
    }
    public int peekFront(){
        return stackarray[top];
    }
    
}
