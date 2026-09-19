class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i!= j && arr[i] == 2 * arr[j]) return true;
            }
        }
        return false; 
        // Arrays.sort(arr);
        // int i = 0, j = arr.length-1;
        // while(i<j){
        //     if(arr[i]*2 == arr[j]) return true;
        //     else if(arr[i]*2 > arr[j]) j--;
        //     else  i++;
        // }
        // return false;
    }
}