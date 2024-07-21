// Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.


import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Number of integers:");
        int n = scanner.nextInt();
        
        int evenSum = 0;
        int oddSum = 0;
        
         
        for (int i = 0; i < n; i++) {
            
            
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
        
        scanner.close();
    }
}
