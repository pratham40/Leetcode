class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            if(nums[right]+nums[left]==target){
                return new int[]{left,right};
            }
            else{
                if(right==left+1){
                    left++;
                    right=nums.length-1;
                }
                else{ 
                    right--;
                }
            }
        }
        return new int[]{};
    }
    
}
