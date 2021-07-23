import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    @Test
    void twoSum0() {
        int[] nums = {11, 2, 4, 6, 7, 15};
        int target = 9;
        int[] ints = new TwoSum().twoSum(nums, target);
        System.out.println("ints: "+ints[0] + " " + ints[1]);
        assertEquals(target, nums[ints[0]] + nums[ints[1]]);
    }

    @Test
    void twoSum1() {
        int[] nums = {3, 2, 4};
        int target = 7;
        int[] ints = new TwoSum().twoSum(nums, target);
        assertEquals(target, nums[ints[0]] + nums[ints[1]]);
    }

    @Test
    void twoSum2() {
        int[] nums = {3, 3};
        int target = 6;
        int[] ints = new TwoSum().twoSum(nums, target);
        assertEquals(target, nums[ints[0]] + nums[ints[1]]);
    }
}