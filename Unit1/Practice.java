package Unit1;

class JustPracting{


    public static void println(String message){
        //this is a wrapper function to wrap the System.out.println into println;

        System.out.println(message);
    
    }

    public void MyJavaProgram(){
        System.out.println("Having Fun in Java Program");

    }

    public static void main(String[] args){
        JustPracting jp = new JustPracting();
        jp.MyJavaProgram();
        
    }

}
