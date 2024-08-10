class NQueen {
  
  public static boolean isSafe(char borad[][], int row, int col) {

    // vertical safe 
    for(int i=row-1 ; i>=0 ; i--) {
      if(borad[i][col] == 'Q') {
        return false;
        }
    }

    // diagonal left safe 
    for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i--,j--) {
      if(borad[i][j] == 'Q') {
        return false;
      }  
  
  }

   // diagonal right safe 
    for(int i=row-1 ,j=col+1 ; i>=0 && j<borad.length ; i--,j++) {
      if(borad[i][j] == 'Q') {
        return false;
      }
    }

      return true;
  
  }

  public static void Nqueen(char borad[][] , int row) {

    if(row == borad.length){
      count++;
        printboard(borad);
        return;
    }

    for(int j=0 ; j<borad.length ; j++) {

      if(isSafe(borad , row , j)) {
        borad[row][j]='Q';
        Nqueen(borad,row+1);  // to add next row
        borad[row][j]='x';  //backtrack and then make it null
      }
        
    }
  }

  public static void printboard(char borad[][]){

    System.out.println("-------------- chess");

    for(int i=0 ; i<borad.length ; i++) {
        for(int j=0 ; j<borad.length ; j++) {
            System.out.print(borad[i][j] +" ");
        }
        System.out.println();
    }

  }

  static int count =0;
  
    public static void main(String[] args) {

      int n =5;
      char borad [][] = new char[n][n];

      for(int i=0 ; i<n ; i++) {
        for(int j=0;j<n;j++){
          borad[i][j]='x';
        }
    }

    Nqueen(borad ,0);
    System.out.println("the total count is = " +count);
  }
}