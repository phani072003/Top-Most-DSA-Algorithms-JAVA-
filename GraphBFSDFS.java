import java.util.*;

public class GraphBFSDFS {

    private int V;
    private LinkedList<Integer> adj[];

     public GraphBFSDFS(int v){
            V = v;
            adj = new LinkedList[V];
            for(int i=0; i<v; i++){
                adj[i] = new LinkedList<>();
            }
          }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void BFS(int s){
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()){
            s=queue.poll();
            System.out.print(s + " ");
            for(int n : adj[s]){
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        
    }
    void DFS(int s){
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        visited[s] = true;
        stack.push(s);
        while(!stack.isEmpty()){
             s=stack.pop();
             System.out.print(s + " ");
             for(int n : adj[s]){
                if(!visited[n]){
                    visited[n] = true; 
                    stack.push(n);
                }
             }
        }

    }
    public static void main(String args[]){
        GraphBFSDFS g = new GraphBFSDFS(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 6);
        g.addEdge(4, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 7);
        System.out.println("BFS staring from vertex 0 : ");
        g.BFS(0);
        System.out.println("\nDFS starting from vertex 0 : ");
        g.DFS(0);

    }

}
