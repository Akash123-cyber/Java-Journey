package Unit1;

class CompoundAssignmentOperators{

    public static void println(String message){
        System.out.println(message); //wrapper method for printing

    }

    public static void main(String[] args){

        //compound assignment
        int x = 10;
        x+=10;
        println("Recent value of x:"+x);

        x-=5;
        println("Recent value of x:"+x);

        int y = 2;
        println("value of y :"+y);
        x*=y;

        println("x=x*y : "+x);

        x/=y;
        println("x=x/y: "+x);

        x%=y;
        println("x=x%y: "+x);








    }
}