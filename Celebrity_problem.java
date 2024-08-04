/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
class Sol{
    
    public int celebrity(int mat[][]) {
        // code here
        int ans=-1,j=0,n=mat.length;
        for(int i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==1)break;
            }
            if(j==n){
                for(j=0;j<n;j++){
                    if(i!=j && mat[j][i]==0)break;
                }
                if(j==n)ans=i;
                break;
            }
        }
        return ans;
    }
}
public class Celebrity_problem {
    public static void main(String[] args) {
        int[][] mat = {{0,1,0},{0,0,0},{0,1,0}};
        Sol obj = new Sol();
        System.out.println(obj.celebrity(mat));
    }
}
