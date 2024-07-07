import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); //hashmap to store elements and their index
        //storing nums length
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int complement = target - nums[i]; //used to check for the solution. If this exists in the hash table then a solution is found
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; //If no solution is found then return an empty array

    }
}

/*
 * Test Cases used: 
 * [2,7,11,15] = 9
[3,2,4] = 6
[3,3] = 6
 */