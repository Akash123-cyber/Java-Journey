package Unit2.Enums;

//Enums in java is a data type that contains fixed set of constants.
// It can be thought of as a clas having fixed set of constants.
// The java enum constants are static and final implicity.
// It is available from JDK 1.5
// It can be used to declare days of the week,months in a Year etc;

// Advantages
// 1> provides type safety
// 2> can be easily used in switch
// 3> can be traversed
// 4> enum can have fields,constructors and methods

// NOTES::
// 1>Enum can not be instantiated using new keyword because it contains private constructors only.
// 2>The Enum can be defined within or outside of the class because it is similar to class.
// 3>Every Enum constant is always implicitly public static final. since it is static , we can access it by using Enum name.

//Example

enum Color{ //pascal casing
    
    RED,GREEN,BLUE;

}

class JavaEnums{
    public static void main(String[] args){

        Color c1 = Color.RED;
        System.out.println(c1);
    }
}