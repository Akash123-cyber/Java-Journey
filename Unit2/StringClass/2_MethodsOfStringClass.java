package Unit2.StringClass;

//Java String Methos
// 1. char charAt(int index) --.> it returns char value for the particular index
// 2. int length() ----> it returns string length
// 3. static String format(String format, Object... args) ----> It returns a formatted string
// 4. static String formatted(Locale l, String format. Object... args) ----> It returns substring for given begin index.
// 5. String substring (int beginIndex) ---> it returns substring for given begin index and end index.
// 6. String substring(int beginIndex, int endIndex) ---> It returns substring for given begin index and end index.
// 7. boolean contains(CharSequence s) ----> It returns true or false after matching the sequence of char value.

// Just like this list all the java String methods with an example atleast
class MethodsOfStringClass{

    public static void main(String[] args){

        // Using concat() method
        String originalString = "Hello";
        String concatenatedString = originalString.concat("World");
        System.out.println("Concatenated String: "+concatenatedString);

        // Using length() method
        String exampleString = "Hello Java";
        int stringLength = exampleString.length();
        System.out.println("Length of the String: "+stringLength);

        // Using equals() method
        String string1 = "Hello";
        String string2 = "Hello";
        boolean areEqual = string1.equals(string2);
        System.out.println("Are the Strings Equal? "+areEqual);

        String string3 = "hello";
        boolean areEqual2 = string1.equals(string3);
        System.out.println("Are the strings Equal? "+areEqual2);
        
    }

}