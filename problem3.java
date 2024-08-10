class Solution {
  public int[] plusOne(int[] digits) {
    int hold = 0;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] == 9) {
        hold = 1;
        digits[i] = 0;
      }
       else {
        hold = 0;
        digits[i]++;
        break;

      }
    }
    if (hold == 1) {
      int[] newDigits = new int[digits.length + 1];
      newDigits[0] = hold;
      for (int i = digits.length; i > 0; i--) {
        newDigits[i] = digits[i - 1];
      }
      return newDigits;
    }
    return digits;
  }
  public static void main(String[] args) {
    int[] digits = {9};
    Solution solution = new Solution();
    int[] result = solution.plusOne(digits);
    System.out.println(Arrays.toString(result));
  }
}