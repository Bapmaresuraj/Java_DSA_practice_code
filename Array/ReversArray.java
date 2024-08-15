 

public class ReversArray {

    public static void revers(int number[]){
        int first=0,last=number.length-1;
        while(first<last){
            int temp= number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }

    }
        public static void main(String[] args) {
        int Number[]={1,2,3,4,5};
        revers(Number);
        for(int i=0;i<Number.length;i++){
            System.out.print(Number[i]+" ");
            }
    }
}
