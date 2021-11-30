import java.util.*;

public class BogoSortVariante2 {
    public static int[] sort(int[] sortingArray) {
        Random rnd = new Random();
        while (!isSorted(sortingArray)) {
            int element1 = rnd.nextInt(sortingArray.length);
            int element2 = rnd.nextInt(sortingArray.length);
            int temp = sortingArray[element1];
            sortingArray[element1] = sortingArray[element2];
            sortingArray[element2] = temp;
        }
        return sortingArray;
    }
    static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
