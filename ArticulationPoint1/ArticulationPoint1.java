class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean vis[]=new boolean[V];
       int low[]=new int[V];
       int tin[]=new int[V];
       int timer=0;
       ArrayList<Integer> a=new ArrayList<Integer>();
       for(int i=0;i<V;i++){
           if(!vis[i]){
               dfs(i,-1,vis,tin,low,adj,timer,a);
           }
       }
       if(a.size()==0)
           {
               a.add(-1);
               return a;
           }
       Collections.sort(a);
       //a.remove(a.get(0));
       return a;
    }
    private void dfs(int node,int parent,boolean vis[],int tin[],int low[],
   ArrayList<ArrayList<Integer>> adj,int timer, ArrayList<Integer> a){
       vis[node]=true;
       tin[node]=low[node]=timer++;
       int child=0;
       for(Integer x:adj.get(node)){
           if(x==parent)
               continue;
           if(!vis[x]){
               dfs(x,node,vis,tin,low,adj,timer,a);
               low[node]=Math.min(low[node],low[x]);
               if(low[x]>=tin[node] && parent!=-1){
                   if(!a.contains(node))
                       a.add(node);
               }
               child++;//if there is dfs  call for multiple childs we take note of it
           }else if(vis[x] && x!=parent){
               low[node]=Math.min(low[node],tin[x]);
           }
       }
       if(parent ==-1 && child>1){//if the starting node has more than 1 components
       //that are not connceted to each other
           a.add(node);
       }
   }
}
