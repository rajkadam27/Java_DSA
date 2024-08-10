public class type_casting{
    
    public static void main(String args []){

        float a = 10.25f;
        int b = (int)a;
        System.out.println(b);

        char c = 'c';
        char d = 'd';
        System.out.println((int)(c));
        System.out.println((int)(d));
        System.out.println(d-c);
        
        byte e = 10;
        byte f = (byte)(e*2);
        System.out.println(f);

    }
}