class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int y = 0; y<4; y++){
        rotate(mat);
        int l = mat.length;
        int t = l*l;
        for(int i = 0; i<l; i++){
            for(int j = 0; j<l; j++){
                if(mat[i][j] == target[i][j]) t--;
            }
        }
        if(t==0)return true;
        }
        return false;
    }
    public void rotate(int [][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i]= temp;
            }
        }
        for(int[] i: a){
            int l = 0, r = a[0].length-1;
            while(l<=r){
                int temp = i[l];
                i[l] = i[r];
                i[r] = temp;
                l++; r--;
            }
        }
    }
}