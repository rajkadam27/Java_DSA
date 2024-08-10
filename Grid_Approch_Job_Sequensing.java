import java.util.*;
class Grid_Approch_Job_Sequensing {

    static class Job{
        int deadLine;
        int profit;
        int id;

        public Job(int deadLine, int profit, int i){
            id = i;
            deadLine = deadLine ;
            profit = profit;
        }
         
    }
  
    public static void main(String[] args) {

      Integer JobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

      ArrayList<Job> Jobs = new ArrayList<>();

      for(int i=0; i<JobsInfo.length; i++){
        Jobs.add(new Job(i,JobsInfo[i][0], JobsInfo[i][1]));
      }

      Collections.sort(Jobs, (obj1 , obj2) ->  obj1.profit-obj2.profit);

      ArrayList<Integer> seq = new ArrayList<>();
      int time =0 ;
      for(int i=0; i<Jobs.size(); i++){
        Job curr = Jobs.get(i);
        if(curr.deadLine>time){
            seq.add(curr.id);
            time++;
        }
      }

      System.out.println("maximum jobs =" +seq.size());

      for(int i=0; i<seq.size() ; i++){
        System.out.println(seq.get(i)+" ");
      }

      System.out.println();
  }
}