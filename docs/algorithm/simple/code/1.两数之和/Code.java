import java.util.Map;
import java.util.HashMap;

class Code {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 7, 4, 5, 6 };
        int target = 9;
        int[] temp = twoSum(nums, target);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return new int[] {};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};

    }
}