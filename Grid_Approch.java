class Grid_Approch {
  
  public static int gridway(int i , int j , int n , int m){

    if(i == n-1 && j ==m-1){  //condition for last cells
        return 1;
    }
    else if(i == n || j == n){   // condition for boundry cells
        return 0;
    }

    int w1 = gridway(i+1, j, n, m);
    int w2 = gridway(i, j+1, n, m);
    return w1 + w2;

  }
  
    public static void main(String[] args) {

      int n =3 , m=3;
      System.out.println(gridway(0,0,n,m));
  }
}