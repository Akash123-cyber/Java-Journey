package Unit2;

// Java defines an expanded form of the break statement.
//  break label;

// by using this form of break, we can break out of one or more blocks of code.
// When this form of break executes, control is transferred out of the named block.
// when this break statement is encountered with the label/name of the loop, it skips the execution any statement after it and takes the control right out of this labelled loop.
// And the control goes to the first statement right after the loop. 

class LabeledBreakStatement{
    public static void main(String[] args){

        int num = 10;
        outer: 
        {   
            while(num>4){
                num--;
                System.out.println(num);
                if (num==5) {
                    System.out.println("Coming out of while loop through normal break statement");
                    break;
            }}

            System.out.println("Executing : num = num - 4;");
            num = num - 5;
            if(num==0){
                System.out.println("Coming out of the outer named block");
                break outer;
            }

            

        }

        System.out.println("Now we are out of the outer block of code");

    }

}