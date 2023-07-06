
    import java.util.HashMap;
import java.util.Map;

    public class  targetsum {
        public static void main(String[] args) {
            int[] nums = {10, 20, 30, 40, 50, 60};
            int target = 100;

            int[] result = findTwoSum(nums, target);

            if (result != null) {
                System.out.println("Indices of the two numbers that add up to the target sum:");
                System.out.println("[" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No two numbers found that add up to the target sum.");
            }
        }

        public static int[] findTwoSum(int[] nums, int target) {
            Map<Integer, Integer> numIndexMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numIndexMap.containsKey(complement)) {
                    int complementIndex = numIndexMap.get(complement);
                    return new int[]{complementIndex, i};
                }
                numIndexMap.put(nums[i], i);
            }

            return null;
        }
    }


