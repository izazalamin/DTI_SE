package day3;

public class ArrayProcessor {
    public int findSecondSmallest(int[] arr) {
        int n = arr.length;

        // we assume at least 2 array
        if (n < 2) {
            throw new IllegalArgumentException("Array at least 2 element");
        }

        // declare the first and the second smallest number
        int smallest = Math.min(arr[0], arr[1]);
        int secondSmallest = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
}
