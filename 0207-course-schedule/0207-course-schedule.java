class Solution {
    public boolean canFinish(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for (int [] edge:edges)
        {
            int src= edge[0];
            int dest = edge[1];
            graph.get(src).add(dest);
        }
        
        boolean[] vis = new boolean[V];
        boolean[] path = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                if(check(graph,vis,path,i))
                return false;
            }
        }
        return true;
    }
    
    public boolean check(List<List<Integer>> graph,boolean[] vis, boolean[] path, int src)
    {
        vis[src]= true;
        path[src] = true;
        
        
        for(int neighbor:graph.get(src))
        {
            if(!vis[neighbor])
            {
                if (check(graph, vis, path, neighbor))
                return true;
            }
            else if(path[neighbor])
            {
                return true;
            }
        }
        path[src]= false;
        return false;
    }
}