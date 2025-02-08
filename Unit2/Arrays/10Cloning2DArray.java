package Unit2.Arrays;
//Cloning two-D Array

// A clone of multi-dimensional array (like object[][]) is a Shallow Copy
// However which is to say that it creates only a single new array with each 
// element array a reference to an original element array, but subarrays are share.


// the outer array has a separate address but its a shallow copy 
// because the elements array (sub arrays) inside the array are shared with the original array they are not cloned only 
// the element references are created which point towards the same element array objects in the memory
class Cloning2DArray{
    public static void main(String[] args){

        int intArray[][]={{1,2,3},{4,5}};
        int cloneArray[][] = intArray.clone();

        //will print false because outer array is a deep copy
        System.out.println(intArray==cloneArray);
        
        //but inner elements are shallow copy thats why output will be true 
        // thats why overall the clone of a 2d array is a shallow copy
        System.out.println(intArray[0]==cloneArray[0]); //true
        System.out.println(intArray[1]==cloneArray[1]); //true

    }
}