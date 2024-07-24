 

public class CallByValue {
    
    public static int swapno(int a , int b){
        System.err.println(" Before the swaping the value of a is"+ "   "+a+"   "+"the value of b is  "+b);
        int temp = a;
         a=b;
        b=temp;
        System.err.println(" Before the swaping the value of a is"+ "   "+a+"   "+"the value of b is  "+b);

        return 0;
    }
    public static void main(String[] args) {

        int a=10;
        int b=20;
        swapno(a, b);
        System.err.println(" the value of a is"+ "   "+a+"   "+"the value of b is  "+b);
        // you notise the value only swap the swap function not in a main function here value are same becuas when you send the value as an argument it not send orignal value it send value as copy  it called call by value 


    }
}
