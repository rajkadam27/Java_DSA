    public class operator{
    
    public static void main(String args []){


//unary operator

         int a =10;
         int b = ++a;
        //  int c = a++;
        System.out.println(a);
        System.out.println(b);
        
//arthematic operator

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

//realtional operator

        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

//assignment operator 
// *=
// /=
        int d =10;
        d +=10;

        int e =5;
        e-=5;
        System.out.println(d);
        System.out.println(e);
        System.out.println(a!=b);
        
//logical operator
        
        System.out.println(2>3 && 5>0);
        System.out.println(2<3 || 5>0);
        // System.out.println(d);
 
    }
}