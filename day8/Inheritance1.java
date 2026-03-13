// // Base class
// class Animal {
//     void speak() {
//         System.out.println("Animal makes a sound");
//     }
// }

// // Derived class
// class Dog extends Animal {
//     @Override
//     void speak() {
//         System.out.println("Dog barks");
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {

//         Animal a = new Animal();
//         Dog d = new Dog();

//         a.speak();   // calls Animal's speak()
//         d.speak();   // calls Dog's overridden speak()

//         // Polymorphism example
//         Animal ad = new Dog();
//         ad.speak();  // calls Dog's speak() at runtime
//     }
// }
   
class Animal{
    void speak(){
        System.out.println("Animal makes sound");

    }

}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("dog barks");
    }

}
public class Inheritance1{
    public static void main(String[] args) {
        Animal ob = new Animal();
        Dog obj = new Dog();
        ob.speak();
        obj.speak();
        
    }
}







