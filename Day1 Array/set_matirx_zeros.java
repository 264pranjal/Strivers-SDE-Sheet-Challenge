public class Solution {
public void setZeroes(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
        return;
    }
    
    int[] rows = new int[matrix.length];
    int[] columns = new int[matrix[0].length];
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0 ; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                rows[i] = 1;
                columns[j] = 1;
            }
        }
    }
    
    for (int i = 0 ; i < rows.length; i++) {
        if (rows[i] == 1) {
            for (int j = 0 ; j < columns.length; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    
    for (int i = 0 ; i < columns.length; i++) {
        if (columns[i] == 1) {
            for (int j = 0 ; j < rows.length; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
}
