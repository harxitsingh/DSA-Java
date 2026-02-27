 import java.util.*;

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index
     for (int i = 0; i < nums.length; i++) {
             int need = target - nums[i];
           if (map.containsKey(need)) {
               return new int[] { map.get(need), i };
           }
             map.put(nums[i], i);        }

        // Guaranteed to exist so this never hits
       return new int[0];
    }
 }
public class Main 
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 9};
        int[] ans = s.plusOne(arr);

        for (int x : ans) System.out.print(x + " ");
    }
}

