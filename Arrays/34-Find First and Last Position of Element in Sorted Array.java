class Solution {
    public int rightMost(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int rightIndex = -1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(nums[mid] == target){
                rightIndex=mid;
                low = mid + 1 ;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return rightIndex;
    }

    public int leftMost(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int leftIndex = -1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(nums[mid] == target){
                leftIndex=mid;
                high = mid - 1 ;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return leftIndex;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = leftMost(nums,target);
        arr[1] = rightMost(nums,target);
        return arr;
    }
}