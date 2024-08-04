/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
class Sol {

    void spirallyTraverse(char[][] arr) {
        int n = arr.length - 1;
        int m = arr[0].length - 1;
        System.out.println(n + " " + m);
        int start = 0;
        int end = n;

        while (start!=end) {
            for (int i = 0; i <= n; i++) {
                System.out.println(arr[start][i]);
            }
            System.out.println();
            for (int j = 1; j < n; j++) {
                System.out.println(arr[j][end]);
            }
            System.out.println();
            for (int k = end; k >= 0; k--) {
                System.out.println(arr[end][k]);
            }
            System.out.println();
            for (int l = end; l > 1; l--) {
                System.out.println(arr[l][start]);
                start++;
                end--;
            }
        }
    }
}

class SpiralMat {

    public static void main(String[] args) {
        char[][] arr = {
            {'a', 'b', 'c', 'd'},
            {'e', 'f', 'g', 'h'},
            {'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p'}
        };

        Sol obj = new Sol();
        obj.spirallyTraverse(arr);
    }
}
