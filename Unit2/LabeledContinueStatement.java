package Unit2;

// Labeled Continue Statement
// 
// A labeled continue statement skips the current iteration of an outer loop marked with the given label.
// in labelled continue statement, we give a label/name to a loop

// when this continue statement is encountered with the label/name of the loop, it skips the execution any statement
// with in the loop for the current iteration and continues with the next iteration  and condition checking in the labelled loop.

class LabeledContinueStatement {
    
    public static void main(String[] args){

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        outerLoop: for (int[] row : arr){
            for(int element : row){
                
                
                if(element == 5){
                    continue outerLoop;    
                }
                System.out.println(element);
                //when the condition of if statement becomes true the labelled continue statement will skip the execution of the second array it self instead of skipping the element inside the second array
                // thats why 5 and 6 wont print and the execution will continue from the 3rd array onwards
            }
        }


    }
}
