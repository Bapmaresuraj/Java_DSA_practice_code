//  Question 2 : Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever. given tem is 130.5

import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Temperature");
        int tem= sc.nextInt();
        if(tem>=100){
            System.out.println("You have fever");
        }else{
            System.out.println("You dont have fever");
        }
    }
    
}
