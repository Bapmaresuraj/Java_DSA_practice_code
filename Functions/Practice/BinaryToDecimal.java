public class BinaryToDecimal {
   
    public  static void BinaryToDecimal(int binaryNO){
        int myNUm = binaryNO;
        int pow=0;
        int DecNum=0;
        while(binaryNO>0){
            int LastDegite = binaryNO%10;
            DecNum = DecNum+(LastDegite*(int)Math.pow(2,pow));
            pow++;
            binaryNO = binaryNO/10;
        }
        System.out.println("Binary no is "+myNUm+"  Decimal no is "+DecNum);
    }
 

public static void DecBin(int Dec){
    int myNUm= Dec;
    int pow=0;
    int BinaryNo=0;
while(Dec>0){
    int rem= Dec %2;
    BinaryNo =BinaryNo+ rem*(int)Math.pow( 10, pow);
    pow++;
    Dec=Dec/2;
}
System.out.println("Decimal no is "+myNUm+"  Binary no is "+BinaryNo);
        }
        
 

    public static void main(String[] args) {
        BinaryToDecimal(10 );
        DecBin(10);

    }
}

