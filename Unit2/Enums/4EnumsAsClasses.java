package Unit2.Enums;

//Java Enumeration are class types (We can give them constructors,add instance variables and methods etc)
// Key points 
//1. enum can contain constructor and it is executed separately for each enum constant at the time of enum class loading.
// 2. we can't create enum objects explicitly and hence we can't invoke enum constructor directly
//3. Every enum constant represents an object of type enum.

enum Apples {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    
    private int price; // Price for each apple

    //why apples and not apple as the enum name because:
    // Every Enum constant is always implicitly public static final. since it is static , we can access it by using Enum name.
    
    // Constructor
    Apples(int p) {
        this.price = p;
    }

    // Method to get price
    int getPrice() {
        return price;
    }
}

class EnumsAsClasses {  // Fixed typo here (Clases -> Classes)
    public static void main(String[] args) {
        // Apples aps;
      
        // ❌ The Problem:
            // Uninitialized Variable: You declared Apples aps;, but you did not assign any value to it. 
            // In Java, local variables (such as aps) must be initialized before you can use them.
            // Accessing Enum Constant Through aps: You are trying to access Winesap through 
            // the aps variable (aps.Winesap.getPrice()), but since aps is uninitialized, it will result in a compilation error.
          
        // ✅ Solution:
            // Instead of using aps, you can directly access the enum constant through the class name Apples without 
            // the need for creating an additional reference variable like aps.

        // Display price of Winesap.
        System.out.println("Winesap costs " + Apples.Winesap.getPrice() + " rupees\n");

        //Displaying all apples and prices.
        System.out.println("All apple prices: ");

        for(Apples a:Apples.values()){
            System.out.println(a+" costs "+a.getPrice()+" Rupees");
        }
// NOTE::
// Apples a is a local variable declared in the loop header.
// You don't need to manually initialize a because the loop does it for you during each iteration.
// How the for-each loop works in this context:
// The Apples.values() method returns an array containing all the enum constants: Jonathan, GoldenDel, RedDel, Winesap, Cortland.
// In the loop, the for-each construct iterates through each element in this array, and in every iteration, the variable a gets assigned one of these enum constants (e.g., first Jonathan, then GoldenDel, etc.).
    }
}
