# DynamicIntegerArray

## Table of Contents

- [Constructors](#constructors)
- [Utility Methods](#utility-methods)
- [Index Based Methods](#index-based-methods)
- [Incrementation Methods](#incrementation-methods)
- [Deletion Methods](#deletion-methods)
- [Languages](#languages)
- [Special Thanks](#special-thanks)
- [License](#license)

## Constructors

- [`DynamicIntegerArray()`](#dynamicintegerarray)
- [`DynamicIntegerArray(int[] array)`](#dynamicintegerarrayint-array)

    - `DynamicIntegerArray()`: Constructs an empty dynamic integer array.
    - `DynamicIntegerArray(int[] array)`: Constructs a dynamic integer array with the provided array of integers.

## Utility Methods

- [`isEmpty()`](#isempty)
- [`getLength()`](#getlength)
- [`clear()`](#clear)

    - `isEmpty()`: Checks if the array is empty.
    - `getLength()`: Returns the length of the dynamic array.
    - `clear()`: Removes all elements from the dynamic array.

## Index Based Methods

- [`getIndex(int index)`](#getindexint-index)
- [`updateIndex(int index, int value)`](#updateindexint-index-int-value)

    - `getIndex(int index)`: Returns the value at the specified index in the dynamic array.
    - `updateIndex(int index, int value)`: Sets the value at the specified index in the dynamic array to the given value.

## Incrementation Methods

- [`AddValue(int increment, int index)`](#addvalueint-increment-int-index)
- [`AddValue(int increment)`](#addvalueint-increment)
- [`AddValue(int[] increment)`](#addvalueint-increment)

    - `AddValue(int increment, int index)`: Adds a new integer value to the dynamic array at the specified index.
    - `AddValue(int increment)`: Adds a new integer value to the end of the dynamic array.
    - `AddValue(int[] increment)`: Adds a new array of integer values to the end of the dynamic array.

## Deletion Methods

- [`deleteValue(int index)`](#deletevalueint-index)
- [`delete(int value)`](#deleteint-value)

    - `deleteValue(int index)`: Deletes the value at the specified index from the dynamic array.
    - `delete(int value)`: Deletes all occurrences of the given value from the dynamic array.

## Languages

Algorithms will be implemented in various languages over time.
Currently supported languages:

- **Java**
- *(More languages will be added in the future)*

## Special Thanks

Special thanks to ChatGPT for assistance in refining the README and the code itself.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
