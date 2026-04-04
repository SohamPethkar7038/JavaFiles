import java.util.ArrayList;

class Solution {


    public void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean vis[],
    ArrayList<Integer> dfsTraversal) {

        vis[node] = true;

        dfsTraversal.add(node);

        for(Integer it : adj.get(node)) {

            if(vis[it] == false) {

                dfsHelper(it, adj, vis, dfsTraversal);
            }
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();

        boolean vis[] = new boolean[V];

        ArrayList<Integer> dfsTraversal = new ArrayList<>();

        dfsHelper(0, adj, vis, dfsTraversal);

        return dfsTraversal;
    }


}
public class _4Dfs {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int V = 5;

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);

        adj.get(1).add(0);

        adj.get(2).add(0);
        adj.get(2).add(4);

        adj.get(3).add(0);

        adj.get(4).add(2);

        Solution sol = new Solution();

        ArrayList<Integer> result = sol.dfs(adj);

        System.out.println(result);
        

    }
}
