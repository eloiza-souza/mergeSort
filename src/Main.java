import java.util.Arrays;

public class Main {

      public static void main(String[] args) {
        // Array of random integers to be sorted
        int[] randomNumbers = {5, 8, 4, 1, 6, 9, 7, 4, 2, 3};

        // Print the original array
        System.out.println("Random numbers: " + Arrays.toString(randomNumbers));

        // Sort the array using Merge Sort
        int[] orderedNumbers = mergeSort(randomNumbers);

        // Print the sorted array
        System.out.println("Sorted numbers: " + Arrays.toString(orderedNumbers));
    }

    /**
     * Sorts an array of integers using the Merge Sort algorithm.
     *
     * @param array The array to be sorted.
     * @return A new sorted array.
     */
    public static int[] mergeSort(int[] array) {
        // Base case: if the array has one or no elements, it is already sorted
        if (array.length <= 1) {
            return array;
        }

        // Divide the array into two halves
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

        // Recursively sort both halves and merge them
        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param left  The first sorted array.
     * @param right The second sorted array.
     * @return A new array containing all elements from both input arrays, sorted.
     */
    public static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and add the smallest to the merged array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                mergedArray[k] = left[i];
                i++;
            } else {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        // Add any remaining elements from the left array
        while (i < left.length) {
            mergedArray[k] = left[i];
            i++;
            k++;
        }

        // Add any remaining elements from the right array
        while (j < right.length) {
            mergedArray[k] = right[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}