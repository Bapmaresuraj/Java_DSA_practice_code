import java.util.Scanner;

public class TotalCost {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the price of pencile");
    
    float pencilePrice= sc.nextFloat();
    System.out.println("Enter the price of eraser");
    float eraserPrice= sc.nextFloat();
    System.out.println("Enter the price of pen");
    float penPrice= sc.nextFloat();

    float TotalPrice=  (float)pencilePrice+eraserPrice+penPrice;
    System.out.println("Total price is "+TotalPrice);

    // add a 18% gst 
    float gst = 0.18f * TotalPrice;
    float totalCostWithGST = TotalPrice + gst;

    System.out.println("The total price with 18% gst is :"+totalCostWithGST);

}
    
}
