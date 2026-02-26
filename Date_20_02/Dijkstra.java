
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
  static class Edge{
    int d;
    int wt;
    Edge(int d,int wt){
      this.d=d;
      this.wt=wt;
    }
  }
  static ArrayList<ArrayList<Edge>> graph=new ArrayList<>();
  static void createGraph(int v){
    for(int i=0;i<=v;i++){
      graph.add(new ArrayList<>());
    }
  }
  static void dijkstra(int src,int dest){
    int v=graph.size();
    int[] distance=new int[v];
    int[] parent=new int[v];
    boolean[] visited=new boolean[v];
    for(int i=1;i<v;i++){
      distance[i]=Integer.MAX_VALUE;
      parent[i]=-1;
    }
    distance[src]=0;
    PriorityQueue<Edge> pq=new PriorityQueue<>(
      (a,b)-> a.wt-b.wt
    );
    pq.add(new Edge(src, 0));
    while(!pq.isEmpty()){
      Edge node=pq.poll();
      if(!visited[node.d])
        visited[node.d]=true;

      for(Edge e:graph.get(node.d)){
        if(!visited[e.d] && distance[node.d]+ e.wt < distance[e.d]){
          distance[e.d]=distance[node.d]+e.wt;
          parent[e.d]=node.d;
          pq.offer(new Edge(e.d, distance[e.d]));
        }
      }
    }
    printPath(src,dest,parent);
  }
  static void printPath(int src,int dest,int[] parent){
    if(parent[dest]==-1) return;
    printPath(src, parent[dest], parent);
    System.out.print(parent[dest]+" ");
  }
  public static void main(String[] args) {
    createGraph(6);
    graph.get(1).add(new Edge(2,3));
    graph.get(1).add(new Edge(6,2));
    graph.get(2).add(new Edge(3,2));
    graph.get(3).add(new Edge(4,1));
    graph.get(6).add(new Edge(5,2));
    graph.get(5).add(new Edge(4,1));
    dijkstra(1, 4);
  }
}
