 

public class Constr {
   public static void main(String[] args) {
    Example no1= new Example();
   } 
}

class Example{
    int a;
    int b;
    public Example( ) {
        a=10;
        b=20;
        int c= a+b;
        System.out.println( "the sum of a and b is"+ c);
    }
    
}
