import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {
    public static void main(String[] args) {
        String input1 = "76523752";
        String input2 = "1122";
        
        List<Integer> uniqueNumbers1 = findUniqueNumbers(input1);
        List<Integer> uniqueNumbers2 = findUniqueNumbers(input2);
        
        System.out.println("Input: " + input1);
        System.out.println("Output: " + uniqueNumbers1);
        
        System.out.println("Input: " + input2);
        System.out.println("Output: " + uniqueNumbers2);
    }
    
    public static List<Integer> findUniqueNumbers(String input) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (char c : input.toCharArray()) {
            int count = 0;
            for (char ch : input.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueNumbers.add(Character.getNumericValue(c));
            }
        }
        return uniqueNumbers;
    }
}
