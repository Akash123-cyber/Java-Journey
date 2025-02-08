package Unit1;

class TerinaryOperator{


    public static void main(String[] args){

        //terinary operator : epression1 ? expression 2 : expression 3

        // if exp1 is true then exp2 will be executed else exp3 will be executed

        int num = 0;
        int denom = 10;
        int quotient = (num == 0) ? (0) : (num/denom); //exp1 is true then exp2 is executed/assigned
        System.out.println("The Result is : "+quotient);
        
        num = 20;
        quotient = (num == 0) ? (0) : (num/denom);//exp1 is false then exp3 is executed and assigned to quotient
        
        System.out.println("Now the Result is : "+quotient);

    }
}