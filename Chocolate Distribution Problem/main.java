// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

import java.util.*;
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here 
        int minDiff = Integer.MAX_VALUE;
        
        Collections.sort(a);
        
        for(int i = 0; i+m-1<n; i++){
            int diff = a.get(i+m-1) - a.get(i);
            if(diff<minDiff){
                minDiff = diff;
            }
        }
        
        return minDiff;
    }
}