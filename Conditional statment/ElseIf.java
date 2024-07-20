

public class ElseIf {
   public static void main(String[] args) {
    int Age = 22;

    if(Age>=18){
        System.out.println("Adult");
        // if when a if block is true then code ans is adult it not check else if and else part 
    }else if(Age>=13){
        System.out.println("Teenager");
        // when if condition is falas then this block are executed 
    }
    else{
        System.out.println("Child");
        // all codintions are false then is executed
    }
   } 
}
