package Unit2.Arrays;

class IndexingInArray{

    public static void main(String[] args){

        //normal array declaration
        int[] arr = {1,2,3,4,5};

        int arr1[] = {6,7,8,9,10};

        System.out.print("Array1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Array2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();


        //Now indexing

        System.out.println("array element at index = 3: "+arr[3]);
        System.out.println("array1 element at index = 3 : "+arr1[3]);
        System.out.println("array element at index = 4: "+ arr[4]);
        System.out.println("---------------------------------------------------------------------");

        //default values for datatypes:

        // int datatype:

        System.out.println("Default values for datatypes:\nDefault value of int type array is 0:");
        int[] zero = new int[5];
        System.err.print("zeroth :");
        
        for (int i = 0; i < zero.length; i++) {
            System.out.print(zero[i]+" ");
        }
        System.out.println();


        System.out.println("---------------------------------------------------------------------");
        
        System.out.println("Default value of char type array is \u0000:");
        char[] Char = new char[5];
        System.err.print("Chars :");
        // In Java, \u0000 is the default value for elements of a char array because it represents the null character, also known as the Unicode character with the code point 0.
        //u0000 is invisible.

// Key Points:
//      Storage:
//      Even though \u0000 is not visible, it is stored in memory as a valid char value (16-bit in Java).

//      Default Value for char:
//      When you declare a char array or an uninitialized char variable, its default value will be \u0000.

//      Printing \u0000:
//      If you explicitly print \u0000, it will not display anything but still takes up space:

        
        for (int i = 0; i < Char.length; i++) {
            System.out.print(Char[i]+" ");
        }
        System.out.println();
        // Characters not visible but in value it is \u0000
        System.out.println("---------------------------------------------------------------------");
        
        // boolean datatype:

        System.out.println("Default value of Boolean type array is false:");
        boolean[] bool = new boolean[5];
        System.err.print("boolean :");
        
        for (int i = 0; i < bool.length; i++) {
            System.out.print(bool[i]+" ");
        }
        System.out.println();

    }   
}