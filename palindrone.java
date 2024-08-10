
public class palindrone{
        
        public static int solution(int num){

        int  rem , revNum=0;


        while(num != 0){

            rem = num%10;
            revNum = revNum*10 + rem;
            num = num/10;
        }

        return revNum;
        
        }
        public static void main(String args []){
             
           int num =121;
           palindrone p = new palindrone();
           System.out.print("pallindrone of "+num+" is :"+p.solution(num));
          
            //  System.out.println(solution(121));

    }

}
