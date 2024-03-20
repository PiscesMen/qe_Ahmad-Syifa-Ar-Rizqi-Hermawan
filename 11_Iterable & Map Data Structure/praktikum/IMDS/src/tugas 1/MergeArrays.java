import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {
    public static void main(String[] args) {
        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};
        String[] arr3 = {"lee", "jinn"};
        String[] arr4 = {"kazuya", "panda"};

        String[] mergedArray = mergeArrays(arr1, arr2);
        String[] mergedArray2 = mergeArrays(arr3, arr4);

        System.out.println(Arrays.toString(mergedArray));
        System.out.println(Arrays.toString(mergedArray2));
    }

    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        List<String> resultList = new ArrayList<>();

        // Tambahkan elemen dari arr1 ke resultList
        resultList.addAll(Arrays.asList(arr1));

        // Tambahkan elemen dari arr2 ke resultList jika belum ada di resultList
        for (String name : arr2) {
            if (!resultList.contains(name)) {
                resultList.add(name);
            }
        }

        return resultList.toArray(new String[0]);
    }

    public static String[] mergeArrays2(String[] arr3, String[] arr4) {
        List<String> resultList = new ArrayList<>();

        // Tambahkan elemen dari arr1 ke resultList
        resultList.addAll(Arrays.asList(arr3));

        // Tambahkan elemen dari arr2 ke resultList jika belum ada di resultList
        for (String name : arr4) {
            if (!resultList.contains(name)) {
                resultList.add(name);
            }
        }

        return resultList.toArray(new String[0]);
    }
}
