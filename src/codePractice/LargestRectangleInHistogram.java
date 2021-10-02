package codePractice;//https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/
import java.util.Stack;

public class LargestRectangleInHistogram {

    public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        Stack<Integer> s = new Stack<>();
        int ar[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) s.pop();
            if (s.isEmpty()) ar[i] = i;
            else ar[i] = i - s.peek() - 1;
            s.push(i);
        }
        s.clear();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) s.pop();
            if (s.isEmpty()) ar[i] = ar[i] + (heights.length - 1 - i);
            else ar[i] = ar[i] + (s.peek() - i - 1);
            ans = Math.max(ans, (ar[i] + 1) * heights[i]);
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        LargestRectangleInHistogram.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
    }
}

