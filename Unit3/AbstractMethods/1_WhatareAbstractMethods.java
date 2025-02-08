package Unit3.AbstractMethods;

//Abstract Classes and abstract methods in java, borrows its meaning from the general idea of being not full defined
// or not concrete.

// Abstract Classes:
// An abstract class is a class that cannot be instantiated directly and is designed to be a blueprint for other classes. 
// It may contain abstract methods(which have no implementation) and regular methods(with implementation).
// Its a clas represents a general concept but is incomplete on its own and requires other concrete classes to provide specific details.


// Abstract methods:
// An abstract method is declared using the abstract keyword.
// An abstract method is a method that is declared without an implementation in an abstract class or interface or enums. It serves as a placeholder,
// requiring  subclasses to provide a specific implementation.
// An abstract method represents a general idea or contract but is incomplete until a subclass implements the specific behavior for that method.

// NOTE:: An Abstract method cannot be instantiated directly means that we cannot create an object or invoke an abstract method without it being implemented
// first in a subclass or concrete class.


// Example of Abstract Method in an Abstract Class

abstract class Animal{

    String name;

    public Animal(String n){
        this.name = n;
    }

    abstract void sound();

    public void sleep(){
        System.out.println("The "+ name +" is sleeping.");
    }
}

class Dog extends Animal{

    Dog(String n){
        super(n); //Calling the parent constructor to initialize name 
    }

    @Override
    void sound(){
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal{

    Cat(String n ){
        super(n);
    }

    @Override
    void sound(){
        System.out.println("The cat meows.");
    }
}

class Implementation{
    public static void main(String[] args){

        Dog dog = new Dog("Bulldog");
        dog.sound();
        dog.sleep();


        Cat cat = new Cat("Scary Cat");
        cat.sound();
        cat.sleep();
    }
}