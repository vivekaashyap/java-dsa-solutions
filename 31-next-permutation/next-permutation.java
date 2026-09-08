class Solution {
    public void reverse(int[] arr){
        int st = 0, ed = arr.length-1;
        while(st<=ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        } 
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums);
            return;
        }
        for(int i = n -1; i>pivot; i--){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        int i = pivot + 1, j = n-1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}