 
// print  inverted and rotated half pyramid
public class Question2 {
    
    public static void HalfPyramid( int n){
        for(int i=1; i<=n; i++){
            // for space
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
                //starsn
               
            }
            for(int l=1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        HalfPyramid(4);
    }
}
