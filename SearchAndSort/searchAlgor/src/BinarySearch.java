public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Kiểm tra xem key có ở giữa không
            if (arr[mid] == target) {
                return mid;
            }
            // Nếu key lớn hơn giá trị ở giữa, bỏ qua nửa trái
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // Nếu key nhỏ hơn giá trị ở giữa, bỏ qua nửa phải
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int target = 10;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Không tìm thấy phần tử " + target + " trong mảng.");
        } else {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số: " + result);
        }
    }

}