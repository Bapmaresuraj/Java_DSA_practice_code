 
 
//  Question 1 : Write a Java program to get a number from the user and print whether it is
//  positive or negative
 import java.util.*;

public class numberPositiveOrNigative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number for check number is negative or positive");
int Number = sc.nextInt();
if(Number<0){
    System.out.println("Number is negative");
} else{
  System.out.println("Number is positive");  
}

    }
}
