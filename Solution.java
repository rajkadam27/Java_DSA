import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, c, 0, nums1.length);
        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);

        Arrays.sort(c);

        int mid = c.length / 2;
        if (c.length % 2 == 0) {
            return (c[mid - 1] + c[mid]) / 2.0;
        } else {
            return c[mid];
        }
    }
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
}