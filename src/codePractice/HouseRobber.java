package codePractice;//https://leetcode.com/problems/house-robber/

import java.util.*;
import java.util.stream.Collectors;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i] + max;
            max = Math.max(max, nums[i - 1]);
        }
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
    public static void main(String[] args) {

    }
}
