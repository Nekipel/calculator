import java.util.Arrays;

public class ArrayMiddle {
    public static void main(String[] args) {
        getArrayMiddle(new int[]{1, 5, 2, 17, 5, 7, 6, 10});
        getArrayMiddle(new int[]{14, 16, 3, 6, 7, 5, 1});
        getArrayMiddle(new int[]{});
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int arrLength = 0;
        for (int i = 0; i < numbers.length; i++){
            arrLength++;
        }
        if(arrLength % 2 == 0) {
            arrLength = 2;
        }
        if(arrLength % 2 != 0){
            arrLength = 1;
        }
        if (numbers.length == 0) {
            arrLength = 0;
        }
        int[] arrEnd = new int[arrLength];

        int i = (arrLength % 2 == 0) ? numbers.length / 2 - 1 : numbers.length / 2;
        for (int j = 0; j < arrEnd.length; j++) {
            for (; i < numbers.length;) {
                arrEnd[j] = numbers[i];
                i++;
                break;
            }
        }
        System.out.println(arrLength);
        System.out.println(Arrays.toString(arrEnd));
        return arrEnd;
    }
}
