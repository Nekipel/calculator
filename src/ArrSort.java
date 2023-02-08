import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        getSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 4, 10);
    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int arrLength = 0;
        for (int i = 0; i < numbers.length; i++){
            if ((numbers[i] > start) & (numbers[i] < end)){
                arrLength++;
            }
        }
        System.out.println(arrLength);
        int[] arrEnd = new int[arrLength];
        int i = 0;
        for (int j = 0; j < arrEnd.length; j++) {
            for (; i < numbers.length; i++) {
                if ((numbers[i] >= start) & (numbers[i] <= end)) {
                    arrEnd[j] = numbers[i];
                    i++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arrEnd));
        return arrEnd;
    }
}
