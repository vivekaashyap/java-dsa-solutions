class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshape = new int[r][c];
        int count = 0;
        if(mat.length * mat[0].length != r*c) return mat;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                reshape[count/c][count%c] = mat[i][j];
                count++;
            }
        }
        return reshape;
    }
}