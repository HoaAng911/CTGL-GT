
public class LinearSeach {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Test case 1: Phần tử có trong mảng
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int target1 = 3;
        int result1 = linearSearch(arr1, target1);
        if (result1 != -1) {
            System.out.println("Phần tử " + target1 + " được tìm thấy tại chỉ số: " + result1);
        } else {
            System.out.println("Phần tử " + target1 + " không có trong mảng.");
        }

    }
}
