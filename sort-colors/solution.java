// https://leetcode.com/problems/sort-colors/

// class Solution {
//     public void sortColors(int[] nums) {
//         int temp = 0;
//         for(int i = 0; i<nums.length-1;i++){
//             for(int j = i+1;j<nums.length;j++){
//                 if(nums[i]>nums[j]){
//                     temp = nums[i];
//                     nums[i]=nums[j];
//                     nums[j]= temp;
//                 }
//             }
//         }
        
//     }
// }


//LEARNT ABOUT DUTCH NATIONAL FLAG ALGORITHM (3-Way Sorting)
class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,mid,start);
                start++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, end);
                end--;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}