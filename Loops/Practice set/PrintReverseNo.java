 

public class PrintReverseNo {
 public static void main(String[] args) {
    int n= 702030;
    while(n>0){
        // for last number 
        int LastDegite =n%10;
        System.out.print(LastDegite);
        // for remove last number
        n=n/10;
    }
 }  
}
