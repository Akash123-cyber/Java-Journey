package Unit2.Arrays;

//Array Cloning is to actually create another array with its own values,
// Java provides the clone() method.

//arr2 = arr1; 
// is not equivalent to 
//arr2 = arr1.clone();

// NOTE: in the first case, only one array is created and two refernces arr1 and arr2 are pointing to the same array.
// while in the second case two different arrays are created.
class CloneMethod{

    public static void main(String[] args){
        int intArray[] ={1,2,3};

        int cloneArray[] = intArray.clone();

        System.out.println(intArray==cloneArray);
        //will print false as deep copy is created for one dimensional array

        for(int i: cloneArray){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}