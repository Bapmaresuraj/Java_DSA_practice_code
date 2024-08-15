 

public class inheritance {
    public static void main(String[] args) {
        Fish f= new Fish();
        f.breathe();// it is method of animal class but it inheret in fish class
        f.eat();
        f.swim();// it is actual method of fish class
    }
}
// Base class
class Animal{
    void eat(){
        System.out.println("Animal can eat");

    }
    void breathe(){
        System.out.println("Animal can brathe");
    }
}

// child class or derived class
class Fish extends Animal{
    void swim(){
        System.out.println("Fish can swim");
    }
}