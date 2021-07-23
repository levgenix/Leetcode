import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int searchedValue = target - nums[i];
            if (map.containsKey(searchedValue)) {
                return new int[]{i, map.get(searchedValue)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
