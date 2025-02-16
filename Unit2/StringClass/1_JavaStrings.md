# Java Strings 🧵

## Characteristics of Java Strings 📝

- Strings in Java are **immutable** 🔒, meaning their values cannot be changed after they are created.
- They can be conceptualized as **arrays of characters** 🔡, starting at index **0** and ending with a **null character (`\0`)**.
- Strings are considered a **distinct data type** 📜 with unique characteristics and behaviors within the language.
- Java provides **two ways to declare strings**:
  1. By using the **`new` keyword** 🆕.
  2. By using **string literals** ✍️.

---

## Declaring Strings in Java 🏗️

### 1. Using the `new` Keyword 🆕

- Strings can be created using the **`new` keyword** along with the `String` class constructor.
- The `String` class in Java provides multiple constructors, one of which allows creating a string using the `new` keyword.
- **Syntax:**

  ```java
  String str = new String("Hello World");
  ```

- `new String("Hello World")` creates a **new instance** 🏭 of the `String` class and initializes it with the specified value.

### 2. Using String Literals ✍️

- A **string literal** is a sequence of characters enclosed within **double quotes** 🗨️.
- **Syntax:**

  ```java
  String str = "Hello World";
  ```

---

## String Constant Pool 🏦

- When a **string literal** is created, the **JVM checks the "String Constant Pool"** before allocating memory.
- The **String Constant Pool** acts as a **repository** 📂 for string constants.
- If the specified string **already exists** in the pool, the JVM **returns a reference** 🔄 to the existing instance instead of creating a new object.
- If the string is **not found** in the pool, a **new object** is created and stored in the pool.
- This mechanism helps in **efficient memory usage** 📉 and **reuse** of identical string constants.

### Example

```java
String s1 = "Apple";
String s2 = "Mango";
String s3 = "Apple";
```

- Here, only **two objects** are created:
  - The first time `"Apple"` 🍏 is encountered, a **new object** is created and added to the **String Constant Pool**.
  - The second time `"Mango"` 🥭 is encountered, a **new object** is created.
  - The third time `"Apple"` 🍏 is encountered, **no new object** is created; instead, `s3` points to the **existing "Apple" instance**.
- This approach ensures that **identical string literals share memory**, optimizing memory efficiency. 🚀

---

## Advantages of String Immutability 🔒

1. **Security** 🛡️: Immutable strings help prevent security vulnerabilities, such as data tampering in networking and class loading.
2. **Performance Optimization** ⚡: Java uses the **String Constant Pool** to optimize memory by reusing string literals.
3. **Thread Safety** 🔄: Since strings are immutable, they can be shared across multiple threads without synchronization issues.
4. **Hashcode Caching** 🏷️: The immutability of strings ensures that their **hashcode is computed only once**, improving the performance of hash-based collections like `HashMap` and `HashSet`.
5. **Efficient Caching** 📦: Due to their immutability, strings can be safely used as **keys** in caches and hash tables.

---

## Memory Allocation for Strings in Java 🗂️

- When a **String object** is created, it is **stored in two places**:
  1. **Heap memory** 🏗️ (for `new String("...")` objects)
  2. **String Constant Pool** 🏦 (for literals and interned strings)
- If a **string with the same value** already exists in the **String Constant Pool**, Java will **reference** that existing instance instead of creating a duplicate.
- This means that all references with **matching values** point to **the same memory location in the pool**, reducing redundancy and improving efficiency 📊.
