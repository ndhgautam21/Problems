package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Question : 54
 */
public class SpiralMatrix {

    /**
     * get all edges of matrix
     *
     * @param matrix  m * n matrix
     * @param list    store value
     * @param visited visited array
     */
    public static void getEdgeElements(int[][] matrix, List<Integer> list, boolean[][] visited) {
        int row = 0;
        int col = 0;
        /// move right from start on matrix
        while (col < matrix[0].length) {
            visited[row][col] = true;
            list.add(matrix[row][col]);
            col++;
        }
        col--;
        row++;
        /// move down after right on matrix
        while (row < matrix.length) {
            visited[row][col] = true;
            list.add(matrix[row][col]);
            row++;
        }
        row--;
        col--;
        /// move left after down on matrix
        boolean isBack = false;
        if (row > 0) {
            while (col >= 0) {
                visited[row][col] = true;
                list.add(matrix[row][col]);
                col--;
                isBack = true;
            }
        }
        col++;
        row--;
        /// move top on matrix after left
        /// and stop before the last element
        if (isBack) {
            while (row > 0) {
                visited[row][col] = true;
                list.add(matrix[row][col]);
                row--;
            }
        }
    }

    /**
     * print elements in spiral traversal.
     *
     * @param matrix  matrix
     * @param list    list to store value
     * @param visited visited array
     */
    public static void spiralMatrix(int[][] matrix, List<Integer> list, boolean[][] visited) {

        getEdgeElements(matrix, list, visited);
        int newROW = matrix.length - 2;
        int newCOLUMN = matrix[0].length - 2;

        if (newROW < 1 || newCOLUMN < 1) return;
        int[][] newMatrix = new int[newROW][newCOLUMN];
        boolean[][] newVisited = new boolean[newROW][newCOLUMN];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!visited[i][j]) {
                    newMatrix[i - 1][j - 1] = matrix[i][j];
                }
            }
        }
        spiralMatrix(newMatrix, list, newVisited);
    }

    public static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        spiralMatrix(matrix, list, visited);
        return list;
    }

    public static void main(String[] args) {

        int[][] rowMatrix = {{1, 2, 3}};
        int[][] columnMatrix = {
                {1},
                {2},
                {3}};
        int[][] threeThreeMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] fourThreeMatrix = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18},
                {19, 20, 21}};
        int[][] fourFiveMatrix = {
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29}};
        int[][] fiveFiveMatrix = {
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34}};

        System.out.println(spiralMatrix(rowMatrix));
        System.out.println(spiralMatrix(columnMatrix));
        System.out.println(spiralMatrix(threeThreeMatrix));
        System.out.println(spiralMatrix(fourThreeMatrix));
        System.out.println(spiralMatrix(fourFiveMatrix));
        System.out.println(spiralMatrix(fiveFiveMatrix));
    }
}
