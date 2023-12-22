class Solution {
    public int minPairSum(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int maxSum=0;
        Arrays.sort(nums);
        while(left<right){
            int sum=nums[left]+nums[right];
            maxSum=Math.max(sum,maxSum);
            left++;
            right--;
        }
        return maxSum;
    }
}
