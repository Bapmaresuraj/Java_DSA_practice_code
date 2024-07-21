package Loops;
// Print hello world 100 times 
public class WhileLoop {

    public static void main(String[] args) {

        int counter = 0;
        while (counter < 100) {
            System.out.println(counter + " " + "Hello world");
            counter++;
        }
        System.out.println("Hello world printed 100 times");
    }
}