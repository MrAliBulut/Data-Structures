public class Main {
    public static void main(String[] args) {
        
        // Initialize a dynamic array with an initial array
        int[] initialArray = {1, 2, 3, 4, 5};
        DynamicIntegerArray dynamicArray = new DynamicIntegerArray(initialArray);

        // Print the array after creation
        System.out.println("\nArray after creation from the initial array:");
        printArray(dynamicArray);

        System.out.println("====================================================\n");

        // Add values to the array
        dynamicArray.AddValue(10);
        dynamicArray.AddValue(20);
        dynamicArray.AddValue(30);

        // Print the array and its length after adding new values
        System.out.println("Array after adding new values:");
        printArray(dynamicArray);
        System.out.println("Length of the array: " + dynamicArray.getLength());
        System.out.println("====================================================\n");

        // Retrieve and update values at specific indices
        int valueAtIndex1 = dynamicArray.getIndex(1);
        System.out.println("Value at index 1: " + valueAtIndex1);
        dynamicArray.updateIndex(1, 50);

        // Print the array after updating value at index 1
        System.out.println("Array after updating value at index 1:");
        printArray(dynamicArray);
        System.out.println("====================================================\n");

        // Add a new value at a specific index
        dynamicArray.AddValue(40, 2);

        // Print the array after adding value at index 2
        System.out.println("Array after adding value 40 at index 2:");
        printArray(dynamicArray);
        System.out.println("====================================================\n");

        // Add an array of values to the end of the array
        int[] incrementArray = {60, 70, 50, 50, 50};
        dynamicArray.AddValue(incrementArray);

        // Print the array after adding an array of values
        System.out.println("Array after adding values {60, 70, 50, 50, 50} to the end of the array:");
        printArray(dynamicArray);
        System.out.println("====================================================\n");

        // Delete a value at a specific index
        dynamicArray.deleteValue(0);

        // Print the array after deleting value at index 0
        System.out.println("Array after deleting value at index 0:");
        printArray(dynamicArray);
        System.out.println("====================================================\n");

        // Delete all occurrences of a value
        dynamicArray.delete(50);

        // Print the array after deleting all occurrences of value 50
        System.out.println("Array after deleting all occurrences of value 50:");
        printArray(dynamicArray);
        System.out.println("====================================================\n");

        // Check if the array is empty
        System.out.println("Is the array empty? " + dynamicArray.isEmpty());
        System.out.println("====================================================\n");

        // Clear the array
        dynamicArray.clear();

        // Print the array after clearing
        System.out.println("Array after clearing:");
        printArray(dynamicArray);
        System.out.println("====================================================\n");

        // Check if the array is empty after clearing
        System.out.println("Is the array empty after clearing? " + dynamicArray.isEmpty() + "\n");

        
    }

    // Helper method to print the contents of the dynamic array
    private static void printArray(DynamicIntegerArray dynamicArray) {
        if (dynamicArray.isEmpty()) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array contents: ");
        for (int i = 0; i < dynamicArray.getLength(); i++) {
            System.out.print(dynamicArray.getIndex(i));
            if (i < dynamicArray.getLength() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
