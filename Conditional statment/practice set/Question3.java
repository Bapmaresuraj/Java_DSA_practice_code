// Question 3 : Write a Java program to input week number(1-7) and print day of week name
// using switch case.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter week number (1-7): ");
        int weekNumber = sc.nextInt();
        
        String dayOfWeek;
        
        switch (weekNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid week number! Please enter a number between 1 and 7.";
                break;
        }
        
        System.out.println(dayOfWeek);
    }
}
