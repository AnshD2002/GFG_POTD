

// User function Template for Java

class Solution {
    public String findOrder(String[] dict, int n, int k) {
        // Write your code here
         List<Set<Integer>> al=new ArrayList<>();
        for(int i=0;i<k;i++) al.add(new HashSet<>());
        for(int i=0;i<n-1;i++){
            String a=dict[i],b=dict[i+1];
            int sm=Math.min(a.length(),b.length());
            boolean foundDifference=false;
            for(int j=0;j<sm;j++){
                int u=a.charAt(j)-'a',v=b.charAt(j)-'a';
                if(a.charAt(j)!=b.charAt(j)){
                    if(!al.get(u).contains(v)) al.get(u).add(v);
                    foundDifference=true;
                    break;
                }
            }
            if(!foundDifference && a.length()>b.length()) return "";
        }
        List<Integer> sl=topologicalSort(k,al);
        StringBuilder sb=new StringBuilder();
        for(int i:sl) sb.append((char)(i+'a'));
        return sb.toString();
        
    }
    
    public List<Integer> topologicalSort(int k,List<Set<Integer>> al){
        int indeg[]=new int[k];
        for(Set<Integer> a:al) for(int i:a) indeg[i]++;
        Queue<Integer> q=new LinkedList<>();
        List<Integer> res=new ArrayList<>(); 
        for(int i=0;i<k;i++) if(indeg[i]==0) q.add(i); 
        while(!q.isEmpty()){
            int curr=q.poll();
            res.add(curr); 
            for(int i:al.get(curr)){
                indeg[i]--;
                if(indeg[i]==0) q.add(i);
            }
        } 
        return res.size()==k?res:new ArrayList<>();
    }
}
