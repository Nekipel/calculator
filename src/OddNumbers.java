import java.util.ArrayList;
import java.util.Arrays;

public class OddNumbers {
    public static void main(String[] args) {
        printOddNumbers(new int[]{3, 5, 20, 8, 7, 3, 100}); //  3,5,7,3
    }

    public static void printOddNumbers(int[] arr) {
        String separator = "";
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                str = str + separator + arr[i];
                separator = ",";
            }
        }
        System.out.println(str);
        System.out.println();
    }
//    public static void printOddNumbers(int[] arr) {
//        ArrayList<String> list = new ArrayList<>();
//        for (int i : arr)
//            if ((i & 1) == 1)
//                list.add(i + "");
//        System.out.print(String.join(",", list));
//    }
}
