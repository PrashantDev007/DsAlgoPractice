package codePractice;

//https://leetcode.com/problems/jump-game/
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) return true;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max == i && nums[i] == 0) return false;
            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
