class Solution {
    public void setZeroes(int[][] matrix) {
        /*the idea is use the first row and columns as indicators to either
        turn the entire row or column to 0s*/
        int col0 = matrix[0][0];
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i<rows; i++) {
            for (int j =0; j<columns;j++) {
                if (matrix[i][j] == 0) {
                    if (j==0) {
                        col0=0;
                        // in this case matrix[i][0] will already be 0;
                    } else {
                        matrix[i][0] = 0; //row indicator
                        matrix[0][j] = 0; //column indicator
                    }
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j<columns; j++) {
                if (matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j=1; j<columns; j++) {
            if (matrix[0][0] == 0 || matrix[0][j] == 0) {
                matrix[0][j] = 0;
            }
        }

        for (int i = 0; i < rows; i++) {
            if (col0 == 0 || matrix[i][0] == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}