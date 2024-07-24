//  factorial of n number 
import java.util.*;
public class Question2 {
    public static  double factorial( double n){
         double f=1; 
        for(int i=1; i<=n; i++){
            f=f*i;

        }
        return  f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a value for factorial");
double n = sc.nextDouble();
System.out.println(" factorial of your no is"+factorial(n));
    }
}
