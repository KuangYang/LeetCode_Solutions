import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    /* Time Complexity: O(n)
     * Space Complexity; O(n), items stored in hash table
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Two Sum Solution!");
    }

    public static void traverse(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        traverse(twoSum(nums, 18));
    }

}
