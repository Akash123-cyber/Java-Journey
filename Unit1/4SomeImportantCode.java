package Unit1;

class ImportantCode{

    public static void println(String message){
        System.out.println(message);
    }

    public static void main(String[] args){

        char x =65; //A
        println("printing the value of variable x: "+x);

        char y = 97; //a
        println("Printing the value of variable y: "+y);

        int a = 0xC; //converting from hex to int
        int b = 0b1111; //converting from binary to int

        println(a+" "+b);//12 15

    }




}