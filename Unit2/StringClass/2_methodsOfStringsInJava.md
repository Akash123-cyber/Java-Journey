# Java String Methods 📝

Java provides a variety of built-in methods for manipulating and working with strings. These methods allow developers to perform operations like searching, modifying, and formatting strings efficiently.

## 1. `charAt(int index)` 🔍

**Description:** Returns the character at the specified index.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(1)); // Output: 'e'
    }
}
```

## 2. `length()` 📏

**Description:** Returns the length of the string.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length()); // Output: 11
    }
}
```

## 3. `format(String format, Object... args)` ✨

**Description:** Returns a formatted string using the given format and arguments.

```java
public class Main {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        String formattedString = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formattedString);
    }
}
```

## 4. `static String formatted(Locale l, String format, Object... args)`

- Returns a formatted string with locale support.

```java
import java.util.Locale;
String str = String.format(Locale.US, "%.2f", 10.4567);
System.out.println(str); // Output: 10.46
```

## 5. `substring(int beginIndex)` ✂️

**Description:** Returns a substring from the given starting index to the end.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(6)); // Output: "World"
    }
}
```

## 6. `substring(int beginIndex, int endIndex)` ✂️

**Description:** Returns a substring from the given start index to the specified end index.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(0, 5)); // Output: "Hello"
    }
}
```

## 7. `contains(CharSequence s)` ✅

**Description:** Checks whether the string contains the specified sequence of characters.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.contains("World")); // Output: true
    }
}
```

## 8. `toUpperCase()` 🔠

**Description:** Converts all characters of the string to uppercase.

```java
public class Main {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.toUpperCase()); // Output: "HELLO"
    }
}
```

## 9. `toLowerCase()` 🔡

**Description:** Converts all characters of the string to lowercase.

```java
public class Main {
    public static void main(String[] args) {
        String str = "HELLO";
        System.out.println(str.toLowerCase()); // Output: "hello"
    }
}
```

## 10. `trim()` ✂️

**Description:** Removes leading and trailing spaces from the string.

```java
public class Main {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        System.out.println(str.trim()); // Output: "Hello World"
    }
}
```

## 11. `replace(char oldChar, char newChar)` 🔄

**Description:** Replaces occurrences of a character with another character.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.replace('l', 'p')); // Output: "Heppo"
    }
}
```

## 12. `String replace(CharSequence target, CharSequence replacement)`

- Replaces each substring of this string that matches the target.

```java
String str = "Java is fun";
System.out.println(str.replace("fun", "awesome")); // Output: "Java is awesome"
```

## 13. `replaceAll(String regex, String replacement)` 🔄

**Description:** Replaces occurrences of a substring matching a regex pattern with another string.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Java is fun! Java is powerful!";
        System.out.println(str.replaceAll("Java", "Python")); // Output: "Python is fun! Python is powerful!"
    }
}
```

## 14. `split(String regex)` 📏

**Description:** Splits the string into an array based on the provided delimiter.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Apple,Banana,Cherry";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

## 15. `equals(Object anotherString)` 🔄

**Description:** Compares two strings for equality.

```java
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); // Output: true
    }
}
```

## 16. `equalsIgnoreCase(String anotherString)` 🔄

**Description:** Compares two strings ignoring case considerations.

```java
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
    }
}
```

## 17. `startsWith(String prefix)` 🔍

**Description:** Checks if the string starts with the specified prefix.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.startsWith("Hello")); // Output: true
    }
}
```

## 18. `endsWith(String suffix)` 🔍

**Description:** Checks if the string ends with the specified suffix.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.endsWith("World")); // Output: true
    }
}
```

## 19. `int indexOf(String str)`

- Returns the index of the first occurrence of the specified substring.

```java
String str = "Java Programming";
System.out.println(str.indexOf("Programming")); // Output: 5
```

## 20. `int lastIndexOf(String str)`

- Returns the index of the last occurrence of the specified substring.

```java
String str = "Hello World, Hello Java";
System.out.println(str.lastIndexOf("Hello")); // Output: 13
```

## 21. `boolean isEmpty()`

- Checks if the string is empty.

```java
String str = "";
System.out.println(str.isEmpty()); // Output: true
```

## 22. `String concat(String str)`

- Concatenates the given string to the end of another string.

```java
String str1 = "Hello";
String str2 = " World";
System.out.println(str1.concat(str2)); // Output: "Hello World"
```

## 23. `char[] toCharArray()`

- Converts the string into a character array.

```java
String str = "Java";
char[] chars = str.toCharArray();
for (char c : chars) {
    System.out.print(c + " ");
}
```

Output:

```
J a v a
```

---
This markdown file provides a detailed overview of Java `String` methods with examples. Happy coding! 🚀😃
