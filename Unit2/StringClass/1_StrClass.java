package Unit2.StringClass;

class StringConstructorExample{

    public static void main(String[] args){
        
        // Creating an Empty String
        String emptyString = new String();
        System.out.println("Empty String: "+emptyString);

        // Creating a string from another string
        String originalString = "Hello, Earth";
        String copiedString = new String(originalString);
        System.out.println("Copied String: "+copiedString);

        // Creating a string from a byte array using default encoding
        byte[] byteArray = {72,101,108,108,111};
        String byteString = new String(byteArray);
        System.out.println("String from Byte Array: "+byteString);

        // Creating a string from a character array;
        char[] charArray = {'J','a','v','a'};
        String charString = new String(charArray);
        System.out.println("String from Character Array: "+charString);

    
    }


}