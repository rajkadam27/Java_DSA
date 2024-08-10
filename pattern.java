public class pattern{
    
    public static void hollow(int TotRow , int TotCol){

//outer loop for rows
        for(int i=1 ; i<=TotRow ; i++){

//inner loop for cols 
//(i,j)
            for(int j=1 ; j<=TotCol ; j++) {


                if( i==1 || i==TotRow || j==1 || j==TotCol){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void inverted_star_pattern(int n){
    
      for(int i=1; i<=n; i++){

        for(int j=1; j<=n-i; j++){

        System.out.print(" ");
       }
       for(int j=1; j<=i; j++){

        System.out.print(" *");
       }
       System.out.println();
        }
    }

public static void inverted_star_pattern_withnum(int n){

       for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){

        System.out.print( j);
       }
       System.out.println();
        }
   }

   
public static void Floyd_tri(int n){

    int counter=1;

       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){

        System.out.print( counter +" ");
        counter++;
       }
       System.out.println();
        }
   }

public static void Zero_One_Tri(int n){


       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){

        if((i+j) % 2 == 0){
            System.out.print(" 1");
        }
        else{
            System.out.print(" 0");
        }
       }
       System.out.println();
        }
   }

   
public static void Butterfly(int n){

//1st half
//outer loop 
       for(int i=1; i<=n; i++){

        //inner loop (stars)
        for(int j=1; j<=i; j++){

          System.out.print("*");

       }
       // spaces 2*(n-i)
       for(int j=1; j<=2*(n-i); j++){

          System.out.print(" ");
       }
       //stars

       for(int j=1; j<=i; j++){
          System.out.print("*");
       }
       System.out.println();
        }

//2nd half
        for(int i=n; i>=1; i--){

        //inner loop (stars)
        for(int j=1; j<=i; j++){

          System.out.print("*");

       }
       // spaces 2*(n-i)
       for(int j=1; j<=2*(n-i); j++){

          System.out.print(" ");
       }
       //stars
       
       for(int j=1; j<=i; j++){
          System.out.print("*");
       }
       System.out.println();
        }
   }


  
public static void Diamond(int n){

//1st half
//outer loop 
       for(int i=1; i<=n; i++){

        //inner loop (space)
        for(int j=1; j<=(n-i); j++){

          System.out.print(" ");

       }
       // stars 2*(n-i)
       for(int j=1; j<=(2*i)-1; j++){

          System.out.print("*");
       }
       System.out.println();
        }

//2nd half
      //   for(int i=n; i>=1; i--){

      //   //inner loop (space)
       
      //   for(int j=1; j<=(n-i); j++){

      //     System.out.print(" ");

      //  }
      //  // stars 2*(n-i)
      //  for(int j=1; j<=(2*i)-1; j++){

      //     System.out.print("*");
      //  }
      //  System.out.println();
      //   }
   }    

    public static void main(String args []){

        hollow(4,5);
        inverted_star_pattern(4);
        inverted_star_pattern_withnum(7);
        Floyd_tri(5);
        Zero_One_Tri(5);
        Butterfly(8);
        Diamond(5);
    }
}