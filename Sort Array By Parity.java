class Solution {
    public int[] swapInArray(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        return nums;
    }

    public int[] sortArrayByParity(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]%2!=0 && nums[right]%2==0){
                swapInArray(nums,left,right);
                left++;
                right--;
            }
            if(nums[left]%2==0){
                left++;
            }
            if(nums[right]%2!=0){
                right--;
            }
        }
        return nums;
    }
}
