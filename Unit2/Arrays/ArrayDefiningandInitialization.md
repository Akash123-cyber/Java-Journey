# Difference Between Defining and Initializing an Array in Java

In Java, **defining** and **initializing** an array are two different concepts:

## 1️⃣ Defining (Declaration) of an Array
Declaring an array means specifying its type and name but not allocating memory for its elements.
```java
int[] arr;  // Declaring an array named 'arr' of type int
```
At this point, `arr` is just a reference to an array, but no actual array object is created yet.

---

## 2️⃣ Initializing an Array
Initializing an array means assigning values to it, either by explicitly allocating memory or directly assigning values.

### ✅ Explicit Memory Allocation
```java
arr = new int[5];  // Allocating memory for 5 integers
```
This creates an array of size 5 with default values (0 for integers).

### ✅ Declaration and Initialization Together
```java
int[] arr = new int[5];  // Declaring and initializing in one step
```

### ✅ Assigning Values at the Time of Declaration
```java
int[] arr = {10, 20, 30, 40, 50};  // Directly assigning values
```
This initializes the array with the specified values.

---

## 🔹 Key Differences

| Aspect | Defining (Declaration) | Initializing |
|--------|------------------------|-------------|
| Purpose | Creates a reference variable for an array | Allocates memory and assigns values |
| Memory Allocation | ❌ No memory allocated | ✅ Memory allocated |
| Example | `int[] arr;` | `arr = new int[5];` or `int[] arr = {1, 2, 3};` |
| Default Values | ❌ No default values | ✅ Default values assigned (0 for int, null for objects) |

---

## 🚀 Example
```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr; // Declaration (no memory allocated)
        arr = new int[3]; // Initialization (allocating memory)
        
        // Assigning values
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        
        // Printing values
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
```

Hope this clears your doubt! 😊🚀
