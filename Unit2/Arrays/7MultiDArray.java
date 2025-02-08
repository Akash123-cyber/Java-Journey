package Unit2.Arrays;

// A Two Dimensional Array is a one dimensional array in which every element is a one dimensional array

class MultiDimensionalArrays{
    public static void main(String[] args){

        // int[][] twoD = new int[4][5];
                    // OR
        int twoD[][] = new int[4][5];

        int i,j,k=0;

        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                twoD[i][j] = k;
                k++;
            }

        }
 
        for (int[] row : twoD) { //since row in itself is an element array so int[] row: twoD syntax will work
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }
}