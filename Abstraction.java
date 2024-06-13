// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).


abstract class Vehicle{

    abstract void engine();
    abstract void engine2();
    

     void type(){
        System.out.println("Four Wheel");
    };
}

class Car extends Vehicle{

     void engine(){
        System.out.println("Turbo 2400 cc");
    }
       
}
class Bike extends Vehicle{

     void engine(){
        System.out.println("Turbo 2400 cc");
    }
       
}

// --------------------xxxxxx-------------------------------------

// another method to acheive abstraction in java is interface:

interface Person{

    void height();  // abstract methods => must be defined on subclass..
    void age();

    // regular method, but if you dont use "default" it will show you not to define body here.
    default void ice(){
        System.out.println("icecreammm");
    }
}

class Human implements Person{

    public void height() {
        System.out.println(5.6);
    }

    public void age() {
        System.out.println(20);
    }

    
}
class Alien implements Person{

    public void height() {
        System.out.println("alien " + 5.6);
    }

    public void age() {
        System.out.println("Alien age " + 20);
    }
    
}

public class Abstraction {
    

    public static void main(String[] args) {
        
        // Vehicle v = new Vehicle() ; // cannot make object of an abstract class.

        Vehicle v = new Car();
        v.engine();
        v.type();
        

       // Person p = new Person() ; // cannot make obj of interface

       Person h = new Human();
       h.height();
       h.age();
        
       Person a = new Alien();
       a.age();
       a.height();
       a.ice();
    }
}
