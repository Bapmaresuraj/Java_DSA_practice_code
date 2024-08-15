
public class methodOverloading {
    public static void main(String[] args) {
        Greet Gr = new Greet();
        Gr.greet("Rahul");
        Gr.greet();
    }
}

class Greet {
    void greet() {
        System.out.println("Hello");
    }

    void greet(String name) {
        System.out.println("Hello " + name);
    }
}
