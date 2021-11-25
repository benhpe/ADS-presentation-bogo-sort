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
        int[] nums = {1, 4, 2, 1, 5, 7, 8, 6};
        bogoSort(nums);
        System.out.println("\n============================================\n");

        System.out.println(Arrays.toString(nums));
        System.out.printf("Took %d shuffles\n", counter);

        System.out.println("\n============================================\n");
    }
}
