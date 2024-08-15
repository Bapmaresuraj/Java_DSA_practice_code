public class classobj {
    public static void main(String[] args) {

dog d1= new dog();
d1.name="Tommy";
d1.bark();
dog d2= new dog();
d2.name="Buddy";
d2.eat();
       
    }

}
class dog {
    int age;
    String name;
    String Color;

    void bark() {
        System.out.println(name+" is barking");
    }

    void eat() {
        System.out.println(name+" is eating");
    }

}
 
