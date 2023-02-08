import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAndSortClass {
    public static void main(String[] args) {
        mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4}); // [1, 2, 3, 4, 4, 5, 7, 8]
        mergeAndSort(new int[]{}, new int[]{1, 4, 3}); // [1, 3, 4]
    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] copyArrMerge = new int[firstArray.length + secondArray.length];
        System.arraycopy (secondArray, 0, copyArrMerge, 0 , secondArray.length);
        System.arraycopy (firstArray, 0, copyArrMerge, secondArray.length , firstArray.length);
        Arrays.sort(copyArrMerge);
        System.out.println(Arrays.toString(copyArrMerge));
        return copyArrMerge;
    }
}
