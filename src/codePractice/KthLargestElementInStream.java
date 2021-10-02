package codePractice;//https://leetcode.com/problems/kth-largest-element-in-a-stream/submissions/
import java.util.*;

class KthLargest {
    int k;
    PriorityQueue<Integer> q = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i = 0; i < nums.length; i++) q.add(nums[i]);
        while (q.size() > k) q.poll();
    }

    public int add(int val) {
        q.add(val);
        while (q.size() > k) q.poll();
        return q.peek();
    }
}

public class KthLargestElementInStream {
    public static void main(String[] args) {
    }
}
