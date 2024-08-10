public class Solution {
    public int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();

        int lastSpaceIndex = s.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            return s.length();
        }

        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World")); //
}