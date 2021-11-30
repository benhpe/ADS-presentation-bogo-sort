import java.util.*;

public class BogoSortVariante2 {
    private static long counter;

    public static int[] sort(int[] sortingArray) {
        Random rnd = new Random();
        while (!isSorted(sortingArray)) {
            int element1 = rnd.nextInt(sortingArray.length);
            int element2 = rnd.nextInt(sortingArray.length);
            int temp = sortingArray[element1];
            sortingArray[element1] = sortingArray[element2];
            sortingArray[element2] = temp;
            counter++;
        }
        return sortingArray;
    }
    static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 1, 5, 7, 8, 6, 12, 20, 71, 72};

        long startTime = System.nanoTime();
        sort(nums);
        long endTime = System.nanoTime();
        long totalTimeMs = (endTime - startTime) / 1000000;
        long totalTimeS = totalTimeMs / 1000;
        System.out.println("\n============================================\n");

        System.out.println(Arrays.toString(nums));
        System.out.printf("Took %d partly shuffles and %dms (%ds)\n", counter, totalTimeMs, totalTimeS);

        System.out.println("\n============================================\n");
    }
}
