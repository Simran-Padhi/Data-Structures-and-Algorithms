package Arrays;

// Insertion Sort in Java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        // Start from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            // Current element to be inserted
            System.out.println("Current iteration: " + i);
            System.out.println("Current element: " + arr[i]);
            int current = arr[i];
            System.out.println("the variable current is :" + current);
            // Compare with the sorted portion
        
            int j = i - 1;
            
            // Shift elements greater than current to the right
            while (j >= 0 && arr[j] > current) {
                System.out.println(" variable j is :" + j);
            
               System.out.println("Comparing " + arr[j] + " and " + current);
               System.out.println(arr[j] + " is greater than " + current + ", shifting " + arr[j] + " to the right");
                arr[j + 1] = arr[j];
                System.out.println("Value of j after shifting: " + j);
                j--;
                System.out.println("Value of j after decrementing: " + j);
            }
            // Insert the current element in correct position
            System.out.println("Inserting " + current + " at position " + (j + 1));
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] unsortedArray = {12, 11, 13, 5, 6};
        System.out.print("Unsorted array: ");
        printArray(unsortedArray);
        
        insertionSort(unsortedArray);
        
        System.out.print("Sorted array: ");
        printArray(unsortedArray);
    }
    
    // Helper method to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
