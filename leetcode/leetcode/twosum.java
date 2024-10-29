package leetcode;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        // Duyệt qua tất cả các phần tử trong mảng
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Kiểm tra xem tổng của hai phần tử có bằng target không
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Nếu có, trả về chỉ số
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution"); // Nếu không tìm thấy
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15, 16, 21 };
        int target = 31;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
