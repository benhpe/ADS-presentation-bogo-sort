import java.util.Arrays;

public class Main {

    //count shuffle amount
    public static int counter = 0;

    public static void bogoSort(int[] numbers) {
        boolean isSorted = false;
        while(!isSorted) {
            shuffle(numbers);
            isSorted = true;
            for(int i = 0; i < (numbers.length - 1); i++) {
                if(numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
        }
    }

    public static void shuffle(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            int newPosition = (int)(Math.random() * numbers.length);
            int temp = numbers[newPosition];
            numbers[newPosition] = numbers[i];
            numbers[i] = temp;
        }
        counter++;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 1, 5, 7, 8, 6, 12, 20, 71, 72};
        long startTime = System.nanoTime();
        bogoSort(nums);
        long endTime = System.nanoTime();
        long totalTimeMs = (endTime - startTime) / 1000000;
        long totalTimeS = totalTimeMs / 1000;
        System.out.println("\n============================================\n");

        System.out.println(Arrays.toString(nums));
        System.out.printf("Took %d shuffles and %dms (%ds)\n", counter, totalTimeMs, totalTimeS);

        System.out.println("\n============================================\n");
    }
}
