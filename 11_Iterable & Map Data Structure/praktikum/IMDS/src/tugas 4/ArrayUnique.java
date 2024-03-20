import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] input1 = {1 ,2 ,3 ,4 };
        int[] input2 = {1 ,3 ,5 ,10 ,16 };
        
        int[] output1 = getUniqueElements(input1, input2);
        System.out.println("Output 1: " + Arrays.toString(output1));
        
        int[] input3 = {3, 8};
        int[] input4 = {2, 8};
        
        int[] output2 = getUniqueElements(input3, input4);
        System.out.println("Output 2: " + Arrays.toString(output2));
    }
    
    public static int[] getUniqueElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        
        for (int num : arr1) {
            if (!contains(arr2, num) && !uniqueElements.contains(num)) {
                uniqueElements.add(num);
            }
        }
        
        return uniqueElements.stream().mapToInt(i -> i).toArray();
    }
    
    public static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
