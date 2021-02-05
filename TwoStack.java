//implement two stacks in an array
public class TwoStack {
    private int maxsize;
    private int[] st1;
    private int[] st2;
    private int top1;
    private int top2;

    public TwoStack(int j){
        this.maxsize=j;
        this.st1=new int[maxsize];
        this.st2=new int[maxsize];
        this.top1=-1;
        this.top2=-1;
    }
    public void push1(int x1){
        top1++;
        st1[top1]=x1;
    }
    public void push2(int x2){
        top2++;
        st2[top2]=x2;
    }
    public int pop1(){
        if(top1==-1){
            return -1;
        }else{
            int temp=top1;
            top1--;
            return st1[temp];
        }
    }
    public int pop2(){
        if(top2==-1){
            return -1;
        }else{
            int temp=top2;
            top2--;
            return st2[temp];
        }
    }

    public static void main(String[] args) {
       TwoStack obb=new TwoStack(3);
       obb.push1(2);
       obb.push1(3);
       obb.push2(4);
       System.out.println(obb.pop1());
       System.out.println(obb.pop2());
       System.out.println(obb.pop2());
        
    }
   
}
