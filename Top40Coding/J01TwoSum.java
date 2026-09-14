package Top40Coding;

import java.util.Arrays;
import java.util.HashMap;

public class J01TwoSum {
    // Approach 1:- using nested loop --> time:- O(n2) --> space:- O(1)
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) { // n times
            int find = target - arr[i];
            for (int j = i + 1; j < n; j++) { // n times
                if (arr[j] == find) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    // Approach 2:- Using HashMap
    public static int[] twoSum2(int[] arr, int target) {
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int find = target - arr[i];
            if (map.containsKey(find)) {
                return new int[] { map.get(find), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 18;

        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSum2(arr, target)));
    }
}
