import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        
        int[] result1 = findTwoSum(nums1, target1);
        System.out.println("Input : [1, 2, 3, 4, 6], target = 6");
        System.out.println("Output : [" + result1[0] + ", " + result1[1] + "]");
        
        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        
        int[] result2 = findTwoSum(nums2, target2);
        System.out.println("Input : [2, 5, 9, 11], target = 11");
        System.out.println("Output : [" + result2[0] + ", " + result2[1] + "]");
    }
    
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("Tidak ada pasangan yang sesuai dengan target yang diberikan.");
    }
}
