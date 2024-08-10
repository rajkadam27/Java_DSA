public class DecToBin{

    
    public static void  BinToDec(int binNum)
    {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;

        while(binNum>0){

            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " +myNum+ " =" +decNum);


    } 

    public static void  DecToBin(int DecNum)
    {
        int myNum = DecNum;
        int binNum = 0;
        int pow = 0;

        while(DecNum>0){

            int rem = DecNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            DecNum = DecNum/2;
        }
        System.out.println("decimal of " +myNum+ " =" +binNum);


    }
    
    public static void main(String args []){

        BinToDec(101);
        DecToBin(5);

    }

    
}