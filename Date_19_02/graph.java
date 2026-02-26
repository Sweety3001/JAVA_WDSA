import java.util.ArrayList;

public class graph {
  static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
  static void createGraph(int v){
      for(int i=0;i<=v;i++){
          graph.add(new ArrayList<>());
      }
  }
  static void addEdge(int src,int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
  }
  public static void main(String[] args) {
    
  }
}
