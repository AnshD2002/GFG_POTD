/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;


class Solution
{
    static class Node{
	    int x;
	    int y;
	    int cost;
	    public Node(int x, int y, int cost){
	        this.x = x;
	        this.y = y;
	        this.cost = cost;
	    }
	}
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> {
            return a.cost - b.cost;
        });
        
        int[][] dist = new int[n][m];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[0][0] = grid[0][0];
        pq.add(new Node(0,0, grid[0][0]));
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            for(int i = 0 ; i < 4; ++i){
                int nbrX = cur.x + dx[i];
                int nbrY = cur.y + dy[i];
                if(valid(nbrX, nbrY, n, m)){
                    if(cur.cost + grid[nbrX][nbrY] < dist[nbrX][nbrY]){
                        dist[nbrX][nbrY] = cur.cost + grid[nbrX][nbrY];
                        pq.add(new Node(nbrX, nbrY, dist[nbrX][nbrY]));
                    }
                }
            }
        }
        return dist[n - 1][m - 1];
    }
    boolean valid(int x, int y, int n, int m){
        return x >= 0 && y >= 0 && x < n && y < m;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] nums = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}};
        int[] nums1 = {1,2,3};
        System.out.println(obj.minimumCostPath(nums));
    }
}


