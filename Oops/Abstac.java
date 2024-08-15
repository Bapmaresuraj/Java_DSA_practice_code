
public class Abstac {
    public static void main(String[] args) {
Dog d=new Dog();
d.sound();
d.walk();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal is created");
    }

    public abstract void sound();

}

class Dog extends Animal{

   
    public void sound(){
        System.out.println("Woof");
        }
        void walk(){
            System.out.println("Dog is walking");
        }
        Dog(){
            System.out.println("Dog is created");
        }
}