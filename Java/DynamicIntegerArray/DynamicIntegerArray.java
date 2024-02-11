public class DynamicIntegerArray{

    private int[] array; // Declare an array to hold integers
    private int length;   // Variable to store the length of the array
    private boolean empty; // True if the array is empty



    //#region Constructors

    /**
     * Constructs a dynamic integer array with the provided array of integers.
     * 
     * @param array The array of integers to initialize the dynamic array.
     * 
     * This constructor initializes the dynamic integer array with the provided array,
     * assigning it to the instance variable 'array'. It also stores the length of
     * the provided array in the 'length' variable.
     */
    public DynamicIntegerArray(int[] array){
        this.array = array; // Assign the provided array to the instance variable
        length = array.length; // Store the length of the provided array
    }


    /**
      * Constructs an empty dynamic integer array.
      * 
      * This constructor initializes the dynamic integer array with an empty state,
      * clearing the array, the length to 0, and marking the array as empty.
      */
     public DynamicIntegerArray() {
         array = null; //new int[0]; // Initialize the array with an empty array
         length = 0;         // Set the length to 0
         empty = true;       // Mark the array as empty
     }

    //#endregion

    /**
     * Checks if the array is empty.
     * 
     * @return true if the array is empty, false otherwise.
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * Returns the length of the dynamic array.
     *
     * @return The length of the array.
     */
    public int getLength() {
        return length;
    }

    /**
     * Removes all elements from the dynamic array.
     */
    public void clear() {
        array = null; //new int[0]; // Reset the array to an empty array
        length = 0;         // Reset the length to 0
        empty = true;       // Mark the array as empty
    }


    
    //#region Index Based Functions

    /**
     * Returns the value at the specified index in the dynamic array.
     * 
     * @param index The index of the value to be retrieved.
     * @return The value at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public int getIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of range");
        }
        return array[index];
    }

    /**
     * Sets the value at the specified index in the dynamic array to the given value.
     * 
     * @param index The index at which the value should be set.
     * @param value The value to be set.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public void updateIndex(int index, int value) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of range");
        }
        array[index] = value;
    }



    //#endregion



    //#region Incrementation Methods
    /**
     * Adds a new integer value to the dynamic array at the specified index.
     * 
     * @param increment The integer value to be added to the array.
     * @param index The index at which the new value should be inserted.
     * 
     */
    public void AddValue(int increment, int index) {
        if (empty){
            array = new int[1];
            array[0]=increment;
            empty = false;
            length++;
        }
        else{
            if (index < 0 || index > length) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of range");
            }
            int[] old = array.clone(); // Create a copy of the current array
            array = new int[length + 1]; // Create a new array with increased size
    
            // Copy old array to new array
            int j = 0;
            for (int i = 0; i < length + 1; i++) {
                if (i == index) {
                    array[i] = increment; // Add the new value at the specified index
                } else {
                    array[i] = old[j++]; // Copy values from the old array
                }
            }
            // Increase the length of the array
            length++;
        }
    }


    /**
     * Adds a new integer value to the end of the dynamic array.
     * 
     * @param increment The integer value to be added to the end of the array.
     * 
     */
    public void AddValue(int increment){
        // Call the AddValue method with the current length as the index
        AddValue(increment, length);
        // Note: The length is already incremented within the AddValue method
    }


    /**
     * Adds a new array of integer values to the end of the dynamic array.
     * 
     * @param increment The array of integer values to be added to the end of the array.
     * 
     * This method increases the size of the array to accommodate the new values
     * and copies the elements from both the existing array and the new array 
     * into the expanded array. The length of the array is updated accordingly.
     */
    public void AddValue(int[] increment){
        int newSize = length + increment.length;
    
        int[] old = array.clone();
        // Create a new array with the combined size of the old array and the increment array
        array = new int[newSize];
    
        // Copy elements from the old array to the new array
        for (int i = 0; i < length; i++){
            array[i] = old[i];
        }
    
        // Copy elements from the increment array to the end of the new array
        for (int i = length, j = 0; i < newSize; i++, j++){
            array[i] = increment[j];
        } 
    
        // Update the length to reflect the new size of the array
        length = newSize;
    }


    //#endregion

    //#region Deletion Methods
    /**
     * Deletes the value at the specified index from the dynamic array.
     * 
     * @param index The index of the value to be deleted from the array.
     * 
     * This method removes the value at the specified index from the array and
     * updates the length of the array accordingly.
     */
    public void deleteValue(int index){
        int[] old = array.clone(); // Create a copy of the current array
        array = new int[length - 1]; // Create a new array with reduced size
    
        for (int i = 0, j = 0; i < length; i++){
            if (i == index){
                continue; // Skip the value at the specified index
            } else {
                array[j++] = old[i]; // Copy non-deleted values to the new array
            }
        }
        length--; // Decrease the length of the array
    }


        /**
     * Deletes all occurrences of the given value from the dynamic array.
     *
     * @param value The value to be deleted from the array.
     *
     */
    public void delete(int value) {
        int[] old = array.clone(); // Create a copy of the current array
        
        // Count the number of occurrences of the value
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (old[i] == value) {
                count++;
            }
        }
    
        // Create a new array with reduced size
        array = new int[length - count];
        int j = 0;
    
        // Copy non-deleted values to the new array
        for (int i = 0; i < length; i++) {
            if (old[i] != value) {
                array[j++] = old[i];
            }
        }
    
        // Update the length of the array
        length -= count;
    }

    
    //#endregion
}