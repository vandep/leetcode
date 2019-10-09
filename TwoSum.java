import java.util.HashMap;
import java.util.Map;

class Solution {
    // 暴力解法，两次遍历，时间复杂度为O(n2)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("no two nums solution");
    }

    // 两遍HashMap法， 时间复杂度为O(n),空间换时间
    // 利用HashMap查找，只需O(1)
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums[i]; i++) {
            int value = target - nums[i];
            if (map.containsKey(value) && map.get(value) != i) {
                return new int[] { i, map.get(value) };
            }
        }
        throw new IllegalArgumentException("no two nums solution");
    }

    // 简化towSum1，一遍HashMap
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value) && map.get(value) != i) {
                return new int[] { i, map.get(value) };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two nums solution");
    }

    public static void main(String[] args) {
        System.out.println("run");
        int[] nums = { 2, 7, 11, 15 };
        int[] solution = twoSum2(nums, 9);
        System.out.printf("solution, two nums index is %d, %d", solution[0], solution[1]);
    }
}