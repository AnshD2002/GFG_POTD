//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if (ans.size() == 0)
                System.out.println("-1");
            else {
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print("[");
                    for (int j = 0; j < ans.get(i).size(); j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    private boolean canPut(int row, int col, int[] temp) {
        for (int r = 0; r < row; r++) {
            int c = temp[r] - 1;
            if (c == col || Math.abs(r - row) == Math.abs(c - col)) {
                return false;
            }
        }
        return true;
    }

    private void help(int n, ArrayList<ArrayList<Integer>> ans, int[] temp, int row) {
        if (row == n) {
            ArrayList<Integer> solution = new ArrayList<>();
            for (int val : temp) {
                solution.add(val);
            }
            ans.add(solution);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (canPut(row, col, temp)) {
                temp[row] = col + 1;
                help(n, ans, temp, row + 1);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[] temp = new int[n];
        help(n, ans, temp, 0);
        return ans;
    }
}
