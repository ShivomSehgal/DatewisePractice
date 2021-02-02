import org.graalvm.compiler.graph.Node;

public class  Graph {
    Vertex[] arrayofLists;
    int indexCounter=0;
    boolean undirected=true;

    class Node{
        public int vertexIdx;
        public Node next;
        public Node(int vertexidx, Node node){
            this.vertexIdx=vertexidx;
            this.next=node;
        }
    }
    class Vertex{
        String name;
        Node adjList;

        public Vertex(String name, Node anode){
            this.name=name;
            this.adjList=anode;
        }
    }
    public Graph(int vcount, String graphtype){
        arrayofLists=new Vertex[vcount];
        if(graphtype.equals("directed")){
            undirected=false;
        }
    }
    
    public void addVertex(String xox){
        arrayofLists[indexCounter]=xox;
        indexCounter++;
    }
    public int indexforName(String x1){
        for(int i=0;i<indexCounter;i++){
            if(arrayofLists[i].name.equals(x1)){
                return i;
            }
        }
        return -1;
    }

    public void addEdge(String src, String des){
        int x1=indexforName(src);
        int x2=indexforName(des);
        arrayofLists[x1].adjList=new Node(x2, arrayofLists[x1].adjList);
        if (undirected){
            arrayofLists[x2].adjList=new Node(x1,arrayofLists[x2].adjList);
        }
    }
}
