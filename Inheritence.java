
class Animal{

    String name = "Lion";
    String name2;


    public Animal(String n){
        this.name2 = n;
    }

    public Animal(int a, int b){
        System.out.println("inside two paremeter constructor ");
    }

    void sound(){
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal {

    void breed(){
        System.out.println("German Shephard");
    }

    // override
    void sound(){
        // super.sound();
        System.out.println("bhaoo bhaoo");
    }

    // super();
    //  super keyword must be on first line of subclass constructor
    public Dog(){
        super(1,2);
        // super("chimpanzee");
        System.out.println(super.name2);
        super.sound();
    }

}




public class Inheritence {
    

    public static void main(String[] args) {
        // Animal an = new Animal();
        Dog d = new Dog();

        d.sound();
        System.out.println(d.name);
        System.out.println(d.name2);
        
    }
}
