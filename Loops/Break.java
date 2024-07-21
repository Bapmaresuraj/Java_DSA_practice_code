 

public class Break {
   public static void main(String[] args) {
    for(int i=0; i<=10; i++){
        
        System.out.println(i);
        if(i==5){
            break;// break use for terminate the loop or exit he loop 
        }
        // continue use continue at location break it skip that value and loop will be executed as per that conditon
    }
    System.err.println("You are the out of the loop");
   } 
}
