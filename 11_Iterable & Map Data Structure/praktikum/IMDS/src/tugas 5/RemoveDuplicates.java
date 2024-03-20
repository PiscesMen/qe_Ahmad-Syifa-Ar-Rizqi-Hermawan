public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input1 = {2, 3, 3, 3, 6, 9, 9};
        int output1 = removeDuplicates(input1);
        System.out.println("Output 1: " + output1);
        
        int[] input2 = {2, 2, 2, 11};
        int output2 = removeDuplicates(input2);
        System.out.println("Output 2: " + output2);
    }
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int writeIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        
        return writeIndex;
    }
}

