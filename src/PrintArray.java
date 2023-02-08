import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        printArray(new int[] {1,2,4,5,3});
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
