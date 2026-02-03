class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] arr = new int[2];
        while(left <= right){
            int add = numbers[left] + numbers[right];
            if(add == target){
                arr[0] = left+1;
                arr[1] = right+1;
                break;
            }
            else if(add > target){
                right--;
            }
            else{
                left++;
            }
        }
        return arr;
    }
}