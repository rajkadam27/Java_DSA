import java.util.PriorityQueue;
import java.util.*;

public class Priority_Queue_student{

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }


    public static void main(String args[]){

        PriorityQueue<Student> pq = new PriorityQueue<>();  
        pq.add(new Student("A",3));
        pq.add(new Student("B",4));
        pq.add(new Student("C",1));
        pq.add(new Student("D",7));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
        
    }

}
