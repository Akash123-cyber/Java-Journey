package Unit2.Arrays;

// When we allocate memory for a multidimensional array at that moment 
// we need to only specify the memory for the first (leftmost) dimension.
// int twoD[][] = new int[4][];
// This type of array is also known as jagged/ or ragged arrays
// • The other dimensions can be assigned manually

class Jagged_ya_RaggedArrays{

    public static void main(String[] args){

        int arr[][] =new int[2][];
        arr[0] = new int[3]; //setting dimension for the array at index 0
        arr[1] = new int[2]; //setting dimension for the array at index 1
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j]=count++;
            }
        }

        System.out.println("Contents of the 2D jagged Array");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}