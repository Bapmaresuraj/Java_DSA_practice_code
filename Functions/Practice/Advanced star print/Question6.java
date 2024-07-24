// butterfly patter

public class Question6 {
    public static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // logic loop
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars j
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // logic loop
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars j
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        butterfly(6);
    }
}
