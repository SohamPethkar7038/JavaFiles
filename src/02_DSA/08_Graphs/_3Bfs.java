// Given a connected undirected graph containing V vertices, represented by a 2-d adjacency list adj[][], where each adj[i] represents the list of vertices connected to vertex i. Perform a Breadth First Search (BFS) traversal starting from vertex 0, visiting vertices from left to right according to the given adjacency list, and return a list containing the BFS traversal of the graph.

// Note: Do traverse in the same order as they are in the given adjacency list.

//Input: adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Solution {

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();

        ArrayList<Integer> bfs = new ArrayList<>();

        boolean vis[] = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
             int node = q.poll();

             bfs.add(node);

             for(Integer it : adj.get(node)) {

                if(vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
             }
        }

        return bfs;

    }
}

public class _3Bfs {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int V = 5;

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

         // adj[][] = [[2,3,1],[0],[0,4],[0],[2]]

         adj.get(0).add(2);
         adj.get(0).add(3);
         adj.get(0).add(1);

         adj.get(1).add(0);

         adj.get(2).add(0);
         adj.get(2).add(4);

         adj.get(3).add(0);

         adj.get(4).add(2);

         Solution bfsTraversal = new Solution();

         ArrayList<Integer> resultTraversal = bfsTraversal.bfs(adj);
         System.out.println("BFS traversal path :" + resultTraversal);

    }
}
