import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class Solution3 {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int student : students) {
            queue.addLast(student);
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int top = sandwiches[sandwiches.length - 1];
            if (queue.peekLast() == top) {
                queue.pollLast();
                sandwiches = Arrays.copyOfRange(sandwiches, 0, sandwiches.length - 1);
            } else {
                queue.addLast(queue.pollLast());
                sandwiches = Arrays.copyOfRange(sandwiches, 0, sandwiches.length - 1);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Solution3 s = new Solution3();
        System.out.println(s.countStudents(new int[]{1,1,0,0}, new int[]{1,0,1,0}));
    }
}