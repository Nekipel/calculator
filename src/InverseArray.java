import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        inverseArray(new int[]{1, 4, 6, 7}); //[7, 6, 4, 1]
        inverseArray(new int[]{}); // []

    }
    public static int[] inverseArray(int[] numbers) {
        int[] newArr = new int[numbers.length];
        int j = numbers.length - 1;
        for (int i = 0; i < newArr.length; i++) {
            for (;j < numbers.length & j >= 0;) {
                newArr[i] = numbers[j];
                j--;
                break;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
