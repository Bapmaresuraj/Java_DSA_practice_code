
// (0-1) triangle pattern 
public class Question5 {

    public static void ZeroOneTrinagle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                
                if((i+j)%2==0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ZeroOneTrinagle(5);
    }
}
