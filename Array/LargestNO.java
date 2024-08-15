import java.util.*;
public class LargestNO {
    public static int LargestValue(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
   public static void main(String[] args) {
    int number[]={4,93,5,6};
    System.out.println("the largest value is : "+LargestValue(number));
   } 
}
