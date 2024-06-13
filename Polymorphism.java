
class Car{

    int a = 90;
    public Car(){
        System.out.println("inside super constructor");
    }

    public void model(){
        System.out.println("Every car has a model");
    }
}

class Toyota extends Car{
    //overriding
    public void model(){
        System.out.println("Grande-2024");
    }
}

class Honda extends Car{

    int a = 95;
    //overriding
    public void model(){
        
        System.out.println("Civic-2024");
    }
    // super() => {parentClass's constructor} can be called out ONLY via subclass' constructor on first line.
    // super.methodNames or super.dataFields  can be called out via in methods in subclass...


}
public class Polymorphism {
    

    public static void main(String[] args) {
        
        Car car = new Car();
        // System.out.println(car);

        // Toyota T = new Toyota();
        // Honda  H = new Honda();
        
        // car.model();
        // T.model();
        // H.model();

        Car toyo = new Toyota();
        Car hond = new Honda();

        car.model();
        toyo.model();
        hond.model();
        System.out.println(hond.a);


    }
}





// Base class
// class Animal {
//     // Method to be overridden
//     public void speak() {
//         System.out.println("Animal speaks");
//     }
// }

// // Derived class Dog
// class Dog extends Animal {
//     // Overriding the speak method
//     @Override
//     public void speak() {
//         System.out.println("Woof!");
//     }
// }

// // Derived class Cat
// class Cat extends Animal {
//     // Overriding the speak method
//     @Override
//     public void speak() {
//         System.out.println("Meow!");
//     }
// }

// // Class with an instance method to demonstrate polymorphism
// class AnimalSpeaker {
//     // Instance method that takes an Animal and calls its speak method
//     public void makeAnimalSpeak(Animal animal) {
//         animal.speak();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Creating instances of Dog and Cat
//         Animal dog = new Dog();
//         Animal cat = new Cat();

//         // Creating an instance of AnimalSpeaker
//         AnimalSpeaker speaker = new AnimalSpeaker();

//         // Demonstrating polymorphism
//         speaker.makeAnimalSpeak(dog);  // Output: Woof!
//         speaker.makeAnimalSpeak(cat);  // Output: Meow!
//     }
// }
