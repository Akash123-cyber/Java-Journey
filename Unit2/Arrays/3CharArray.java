package Unit2.Arrays;
//char arrays are special
class CharArray{

    public static void main(String[] args){
        
        char Char[] = new char[5];
        System.out.println("Char arrays by default has a value : \u0000\nwhich invisible on printing");

        System.err.print("Char Array: ");
        for (int i = 0; i < Char.length; i++) {
            System.out.print(Char[i]);
        }
        System.out.println();

        //Char Arrays canbe displayed using println statement only
        //but output would be a joint output all characters would joined by default.
        char arr[] = {'a','b','c','d'};
        System.out.println(arr);//output : abcd

        
    }
}