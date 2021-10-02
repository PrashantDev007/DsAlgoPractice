package codePractice;

//https://leetcode.com/problems/unique-paths-ii/discuss/1489083/100-faster-no-extra-space
public class UniquePathII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid[0][0] == 1) obstacleGrid[0][0] = -1;

        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {

                if (i == 0 && j != 0 && obstacleGrid[i][j - 1] == -1) obstacleGrid[i][j] = -1;
                else if (j == 0 && i != 0 && obstacleGrid[i - 1][j] == -1) obstacleGrid[i][j] = -1;

                if (obstacleGrid[i][j] == 0) obstacleGrid[i][j] = 1;
                else if (obstacleGrid[i][j] == 1) obstacleGrid[i][j] = -1;

                if (i != 0 && j != 0 && obstacleGrid[i][j] != -1) {
                    if (obstacleGrid[i - 1][j] == -1 && obstacleGrid[i][j - 1] == -1) obstacleGrid[i][j] = -1;
                    else if (obstacleGrid[i - 1][j] == -1 || obstacleGrid[i][j - 1] == -1)
                        obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1] + 1;
                    else obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }

        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == -1) return 0;
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    public static void main(String args[]) {
    }
}
