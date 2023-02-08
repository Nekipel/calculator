import java.util.Arrays;

public class ArrayMiddleClass {
    public static void main(String[] args) {
    getArrayMiddle(new int[]{1, 5, 2, 17, 5, 3, 6, 4});  //[5, 2]
    getArrayMiddle(new int[]{14, 16, 3});  //[16]
        getArrayMiddle(new int[]{});  //[16]
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int indexFrom = 0;
        int indexTo = 0;
        if (numbers.length % 2 == 0) {
            indexFrom = (numbers.length / 2) - 1;
            indexTo = indexFrom + 2;
        }
        if (numbers.length % 2 != 0){
            indexFrom = numbers.length / 2;
            indexTo = indexFrom + 1;
        }
        if (numbers.length == 0) {
            indexFrom = 0;
            indexTo = 0;
        }
        int [] numbersCopy = Arrays.copyOfRange(numbers, indexFrom, indexTo);
        System.out.println(Arrays.toString(numbersCopy));
        return numbersCopy;
    }
}
