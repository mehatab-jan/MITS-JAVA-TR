class Animal {
    void speak(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Cat meows");
    }
}
class Inheritance1{
    public static void main(String[] args) {
        Animal ob[]= new Animal();
                    ob[0]=new Dog();
                    ob[1]=new Cat();
                    ob[2]=new Animal();
                for(Animal obj:obj){
                obj.speak();
        }
    }
}