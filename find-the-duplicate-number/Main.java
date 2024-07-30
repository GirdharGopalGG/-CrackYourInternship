// https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int key: map.keySet()){
            if(map.get(key)>1)
            res = key;
        }
        return res;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Array with a duplicate number
        int[] nums1 = {1, 3, 4, 2, 2};
        int result1 = solution.findDuplicate(nums1);
        System.out.println("The duplicate number in nums1 is: " + result1);
        
        // Test case 2: Another array with a duplicate number
        int[] nums2 = {3, 1, 3, 4, 2};
        int result2 = solution.findDuplicate(nums2);
        System.out.println("The duplicate number in nums2 is: " + result2);
        
        // Test case 3: Array with all unique numbers
        int[] nums3 = {1, 2, 3, 4};
        int result3 = solution.findDuplicate(nums3);
        System.out.println("The duplicate number in nums3 is: " + result3);  // Expecting 0 or some indication of no duplicate
        
        // Test case 4: Empty array
        int[] nums4 = {};
        int result4 = solution.findDuplicate(nums4);
        System.out.println("The duplicate number in nums4 is: " + result4);  // Edge case
        
    }
}