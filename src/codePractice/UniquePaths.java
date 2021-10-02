package codePractice;//https://leetcode.com/problems/unique-paths/

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] ar = new int[m][n];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == 0 || j == 0) {
                    ar[i][j] = 1;
                } else
                    ar[i][j] = ar[i - 1][j] + ar[i][j - 1];
            }
        }
        return ar[m - 1][n - 1];
    }

    public static void main(String[] args) {

    }
}
