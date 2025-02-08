# Shallow Copy vs Deep Copy in Java Arrays

## Introduction
When working with arrays in Java, understanding the difference between **shallow copy** and **deep copy** is crucial. These concepts determine how data is copied from one array to another and how changes in one affect the other.

## 1D Arrays

### Shallow Copy (1D Array)
A **shallow copy** of a 1D array refers to copying only the reference to the original array, not the actual elements. Modifying the copied array will also modify the original array since both references point to the same memory location.

#### Example:
```java
public class ShallowCopy1D {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] shallowCopy = original; // Shallow copy
        
        // Modifying the copied array
        shallowCopy[0] = 99;
        
        // Printing both arrays
        System.out.println("Original Array: " + java.util.Arrays.toString(original));
        System.out.println("Shallow Copy: " + java.util.Arrays.toString(shallowCopy));
    }
}
```
#### Output:
```
Original Array: [99, 2, 3, 4, 5]
Shallow Copy: [99, 2, 3, 4, 5]
```
🔹 Since both arrays refer to the same memory, modifying `shallowCopy` also modifies `original`.

### Deep Copy (1D Array)
A **deep copy** of a 1D array involves creating a new array and copying each element individually, ensuring that changes in the copied array do not affect the original array.

#### Example:
```java
public class DeepCopy1D {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] deepCopy = original.clone(); // Deep copy
        
        // Modifying the copied array
        deepCopy[0] = 99;
        
        // Printing both arrays
        System.out.println("Original Array: " + java.util.Arrays.toString(original));
        System.out.println("Deep Copy: " + java.util.Arrays.toString(deepCopy));
    }
}
```
#### Output:
```
Original Array: [1, 2, 3, 4, 5]
Deep Copy: [99, 2, 3, 4, 5]
```
🔹 Since `deepCopy` is a separate array, modifications to it do not affect `original`.

## 2D Arrays

### Shallow Copy (2D Array)
A **shallow copy** of a 2D array only copies the references to the sub-arrays. Modifying any element in the copied array will also reflect in the original array.

#### Example:
```java
public class ShallowCopy2D {
    public static void main(String[] args) {
        int[][] original = {{1, 2}, {3, 4}};
        int[][] shallowCopy = original; // Shallow copy
        
        // Modifying the copied array
        shallowCopy[0][0] = 99;
        
        // Printing both arrays
        System.out.println("Original Array: " + java.util.Arrays.deepToString(original));
        System.out.println("Shallow Copy: " + java.util.Arrays.deepToString(shallowCopy));
    }
}
```
#### Output:
```
Original Array: [[99, 2], [3, 4]]
Shallow Copy: [[99, 2], [3, 4]]
```
🔹 Since both `original` and `shallowCopy` refer to the same sub-arrays, changes in one reflect in the other.

### Deep Copy (2D Array)
A **deep copy** of a 2D array creates new sub-arrays and copies each element individually, ensuring that modifying the copied array does not affect the original.

#### Example:
```java
public class DeepCopy2D {
    public static void main(String[] args) {
        int[][] original = {{1, 2}, {3, 4}};
        int[][] deepCopy = new int[original.length][];
        
        for (int i = 0; i < original.length; i++) {
            deepCopy[i] = original[i].clone(); // Deep copy each row
        }
        
        // Modifying the copied array
        deepCopy[0][0] = 99;
        
        // Printing both arrays
        System.out.println("Original Array: " + java.util.Arrays.deepToString(original));
        System.out.println("Deep Copy: " + java.util.Arrays.deepToString(deepCopy));
    }
}
```
#### Output:
```
Original Array: [[1, 2], [3, 4]]
Deep Copy: [[99, 2], [3, 4]]
```
🔹 The `deepCopy` array has independent sub-arrays, preventing modifications from affecting `original`.

## Summary Table

| Copy Type  | 1D Array Behavior | 2D Array Behavior |
|------------|------------------|------------------|
| Shallow Copy | References the same array, changes affect both | References the same sub-arrays, changes affect both |
| Deep Copy | Creates a new array, changes do not affect original | Creates new sub-arrays, changes do not affect original |

## Conclusion
- **Shallow Copy** is faster but links the copied array to the original.
- **Deep Copy** ensures data independence but requires additional memory and processing.
- Use **`.clone()`** for 1D arrays and **manually clone each row** for 2D arrays to achieve deep copying.

✅ Choose deep copy when you need independent copies, and use shallow copy when performance is a priority and shared modifications are acceptable!
