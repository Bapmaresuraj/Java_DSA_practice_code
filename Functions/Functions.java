
public class Functions {

    // here the function of print hello word and it function called function
    // defination

    public static void printHello() {
        System.out.println("Hello World");
    }

    public static int sumoftwoNumbers(int number1, int number2) { // no1 and no2 call parameters
        int sum = number1 + number2;
        return sum; // make sure when you use int type when return the value other wise java give
                    // you error
    }

    public static void main(String[] args) {

        printHello(); // its function call
        int sum = sumoftwoNumbers(10, 20); // its function call and here no1 and no2 arguments or actual parameters
        System.out.println(sum);
    }
}
