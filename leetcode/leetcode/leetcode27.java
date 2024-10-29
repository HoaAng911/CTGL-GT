package leetcode;

public class leetcode27 {
    public int removeElement(int[] nums, int val) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[curIndex] = nums[i];
                curIndex++;
            }
        }
        return curIndex;
    }

    // Test Giai thuat
    public static void main(String[] args) {
        leetcode27 LC = new leetcode27();
        int[] nums1 = { 3, 2, 2, 3 };
        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val1 = 3;
        int val2 = 2;
        int Newlenght1 = LC.removeElement(nums1, val1);
        int Newlenght2 = LC.removeElement(nums2, val2);
        System.err.println("Test case 1 co do dai la " + Newlenght1);
        System.err.println("Test case 2 co do dai la " + Newlenght2);
    }
}
