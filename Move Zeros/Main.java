// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        int countOfZero = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                countOfZero++;

            }
            else if(countOfZero>0){
                int temp = nums[i];
                nums[i]=0;
                nums[i-countOfZero]=temp;
            }
        }
    }
}