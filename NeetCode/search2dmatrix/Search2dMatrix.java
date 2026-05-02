package NeetCode.validate_parentheses.search2dmatrix;
// https://neetcode.io/problems/search-2d-matrix/history?submissionIndex=1
public class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int columnLength = matrix[0].length;
        int rowLength = matrix.length;
        int resultRow = -1;
        for (int i = 0; i < rowLength; i++) {
            if (matrix[i][columnLength - 1] >= target) {
                resultRow = i;
                break;
            }
        }
        if (resultRow == -1) {
            return false;
        }
        for (int i = 0; i < columnLength; i++) {
            if (matrix[resultRow][i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Search2dMatrix search2dMatrix = new Search2dMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(search2dMatrix.searchMatrix(matrix, target));
    }
}
