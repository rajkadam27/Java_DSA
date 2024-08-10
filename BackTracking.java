class BackTracking {
  public static void changeArr(int arr[], int i, int value) {
    if (i == arr.length) {
      printarr(arr);
      return;
    }
    arr[i] = value;
    changeArr(arr, i + 1, value + 1);
    arr[i] = arr[i] - 2;
  }

  public static void printarr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void findsubArr(String str, String ans, int i) {
    // base case

    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      } else {
        System.out.println(ans);
      }

      return;
    }

    // yes choice
    findsubArr(str, ans + str.charAt(i), i + 1);

    // no choice
    findsubArr(str, ans, i + 1);
  }

  public static void permutationArr(String str1, String ans) {
    if (ans.length() == 0) {
      System.out.println(ans);
      return;
    }

    // recursion function

    for (int i = 0; i < str1.length(); i++) {

      char curr = str1.charAt(i);

      // "abcde" = "ab" + "de"

      String Newstr1 = str1.substring(0, i) + str1.substring(i + 1);

      permutationArr(Newstr1, ans+curr);
    }
  }

    public static void main(String[] args) {
      int arr[] = {5, 4, 3, 2, 1};
      changeArr(arr, 0, 1);
      printarr(arr);

      String str = "abc";
      findsubArr(str, "", 0);

      String str1 = "abcd";
      permutationArr(str1, "");
    }
  
}