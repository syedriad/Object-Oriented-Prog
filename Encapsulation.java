// Encapsulation is one of the fundamentals of OOP (object-oriented programming). It refers to the bundling of data with the methods that operate on that data. Encapsulation is used to hide the values or state of a structured data object inside a class, preventing unauthorized parties' direct access to them

class Person{

    //private fields- can only be accessed through public getter/setter
    private int age;
    private String name;
    
    public String cast;


    public Person(){
        
    }
    public Person(String c){
        this.cast = c;
    }

   

    public void setAge(int a){
        this.age = a;
    }
    public void setName(String n){
        this.name = n;
    }
    
    public int getAge(){
        return this.age;
    }


    public String getName(){
        return this.name;
    }
    public String getCast(){
        return this.cast;
    }



}

public class Encapsulation{

   

    public static void main(String[] args) {
        
        Person enc = new Person();
        Person enc2 = new Person("syed");

       // Using setter methods to set values

        enc.setAge(20);
        enc.setName("Riyad");

        // System.out.println(enc.age); // will throw error.

        // Using getter methods to access values
        System.out.println(enc.getAge());
        System.out.println(enc.getName());

        System.out.println(enc2.cast);
    }
}