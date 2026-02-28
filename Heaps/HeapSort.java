package Heaps;

public class HeapSort {
    int[] arr;

    public HeapSort(int[] nums) {
        this.arr = nums;
        int n = arr.length;

        // Step 1: Build the max heap
        for (int i = (n - 2) / 2; i >= 0; i--) {
            heapify(n, i);
            //swap(0, i);
        }

        // Step 2: Perform heap sort
        for (int i = n -1 ; i > 0; i--) {
            swap(0, i); // Move current root to the end
            heapify(i, 0); // Re-heapify the reduced heap
            //swap(0, i);
        }
    }

    // Swap function
    private void swap(int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Get left child
    private int left(int index) {
        return 2 * index + 1;
    }

    // Get right child
    private int right(int index) {
        return 2 * index + 2;
    }

    // Heapify the subtree rooted at index
    private void heapify(int size, int index) {
        int max = index; // Initialize largest as root
        int left = left(index); // Left child
        int right = right(index); // Right child

        // Check if left child exists and is greater than root
        if (left < size && arr[left] > arr[max]) {
            max = left;
        }

        // Check if right child exists and is greater than current max
        if (right < size && arr[right] > arr[max]) {
            max = right;
        }

        // If max is not root, swap and continue heapifying
        if (max != index) {
            swap(index, max);
            heapify(size, max);
        }
    }

    // Utility to print the array
    public void printArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {4, 10, 3, 5, 1};
        HeapSort heapSort = new HeapSort(nums);
        heapSort.printArray(); // Output: 1 3 4 5 10
    }
}

