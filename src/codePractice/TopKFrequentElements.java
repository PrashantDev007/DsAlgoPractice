package codePractice;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/top-k-frequent-elements/

class TopKFrequentElements {
    static class Node {
        Integer value;
        Integer frequency;
        Node(Integer value, Integer frequency) {
            this.frequency = frequency;
            this.value = value;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Node> q = new PriorityQueue<>(k,(o1, o2) -> o1.frequency-o2.frequency);
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i : nums) {
            if (m.get(i) != null) m.put(i, m.get(i) + 1);
            else m.put(i, 1);
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> map : m.entrySet()) {
            if (i == k) {
                if (q.peek().frequency < map.getValue()) {
                    q.poll();
                    q.add(new Node(map.getKey(), map.getValue()));
                }
            } else {
                q.add(new Node(map.getKey(), map.getValue()));
                i++;
            }
        }

        int ans[] = new int[k];
        for (int j = 0; j < k; j++) {
            ans[j] = q.poll().value;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
