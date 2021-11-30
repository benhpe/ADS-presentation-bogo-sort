public class BogoSortVariante1_2 {
    void bogoSort(int[] a)
    {
        while (!isSorted(a)){
            shuffle(a);
        }
    }
    void shuffle(int[] a)
    {
        for (int i = 0; i < a.length; i++){
            swap(a, i, (int)(Math.random() * i));
        }
    }

    void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    boolean isSorted(int[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] a = { 3, 2, 5, 1, 0, 4 };
        BogoSortVariante1_2 ob = new BogoSortVariante1_2();
        ob.bogoSort(a);
        System.out.print("Sorted array: ");
        ob.printArray(a);
    }
}
