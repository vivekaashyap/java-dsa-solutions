class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n+1];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[grid[i][j]]++;
            }
        }
        int r = -1, m = -1;
        for(int i = 1; i<=n*n; i++){
            if(arr[i]==2) r = i;
            else if(arr[i]==0) m = i;
        }
        return new int[]{r,m};
    }
}