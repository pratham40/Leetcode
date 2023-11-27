class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int j=0;
        for(int i:nums1){
            arr[j++]=i;
        }
        for(int i:nums2){
            arr[j++]=i;
        }
        Arrays.sort(arr);
        // double ans=(arr.length%2==0)?(arr[arr.length/2]+arr[(arr.length/2)-1])/2:arr[arr.length/2];
        if(arr.length%2==0){
            double d=arr[arr.length/2]+arr[arr.length/2-1];
            return d/2;
        }
        else{
            double ans=arr[arr.length/2];
            return ans;
        }
    }
}
