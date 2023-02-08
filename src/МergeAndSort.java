import java.util.Arrays;

public class МergeAndSort {
    public static void main(String[] args) {
        mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4}); //[1, 2, 3, 4, 4, 5, 7, 8]
        mergeAndSort(new int[]{}, new int[]{1, 4, 3}); // [1, 3, 4]
    }

    public static int[] sortArr(int[] arr) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        return arr;
    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] firstArrayNew = sortArr(firstArray);
        int[] secondArrayNes = sortArr(secondArray);
        int[] newArr = new int[firstArrayNew.length + secondArrayNes.length];

        int i=0, j=0;
        for (int k=0; k<newArr.length; k++) {

            if (i > firstArrayNew.length-1) {
                int a = secondArrayNes[j];
                newArr[k] = a;
                j++;
            }
            else if (j > secondArrayNes.length-1) {
                int a = firstArrayNew[i];
                newArr[k] = a;
                i++;
            }
            else if (firstArrayNew[i] < secondArrayNes[j]) {
                int a = firstArrayNew[i];
                newArr[k] = a;
                i++;
            }
            else {
                int b = secondArrayNes[j];
                newArr[k] = b;
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
