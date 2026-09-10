import java.util.HashSet;

public class J01RemoveDuplicate {
    public static int[] removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int[] arr1 = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

        int[] arr2 = { 1, 2, 3 };
    }
}
