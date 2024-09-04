package day3;

public class ArrayProcessor {
    public int findSecondLargest(int[] arr) {
        int n = arr.length;
        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen jika tidak terurut
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Setelah diurutkan, elemen terbesar kedua ada di indeks n-2
        return arr[n - 2];
    }
}
