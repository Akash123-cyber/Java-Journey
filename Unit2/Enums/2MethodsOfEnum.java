package Unit2.Enums;

//Methods -> values(),valueOf() and ordinal() methods

// > The java compiler internally adds the values(),ValueOf() and ordinal() methods when it creates and enum.
// 1> The values() method returns an array containing all the values of the enum.
// 2> valueOf() method returns the enum constant of the specified string value if exits
// 3> By using ordinal() method, each enum constant index can be found, just like array index


class MethodOfEnums{
    public static void main(String[] args){

        //declaring the enum inside the class
        enum Season {WINTER,SPRING,SUMMER,FALL};
        for(Season s : Season.values()){
            System.out.println(s);

        }
        System.out.println("-----------------------------------------------------");
        
        System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of WINTER is: "+Season.WINTER.ordinal());
        System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());
        
    }  

}