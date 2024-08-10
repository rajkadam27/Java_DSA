import java.util.*;
class Grid_Approch_Indian_coins {
  
    public static void main(String[] args) {

      Integer Coins[] = {1,2,5,10,20,50,100,200,500,2000};

      Arrays.sort(Coins ,Comparator.reverseOrder());

      int CountOfCoins = 0;
      int amount = 590;
      ArrayList<Integer> ans = new ArrayList<Integer>(); 

      for(int i=0 ; i<Coins.length ; i++) {

        if(Coins[i]<=amount){
            while(Coins[i]<=amount){
                CountOfCoins++;
                ans.add(Coins[i]);
                amount -= Coins[i];  
            }
        }
      }

      System.out.println("total count of coins " +CountOfCoins);

      for(int i=0 ; i<ans.size() ; i++){
        System.out.print(ans.get(i)+" ");
      }
      System.out.println();
  }
}