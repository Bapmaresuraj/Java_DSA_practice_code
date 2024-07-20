
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String args[]){
Scanner Sc = new Scanner(System.in);
/*
// first you want to creat three variables for storing value for sum 

int a =30;
int b =40;
int sum = a+b;

System.out.println("sum of a+b is :"+sum);
*/

System.out.println("Enter a First Number :");

int a =Sc.nextInt();
System.out.println("Enter a Secound Number:");
int b= Sc.nextInt();

int sum = a+b;
System.out.println("The sum of a + b is : "+sum);

    }
}
