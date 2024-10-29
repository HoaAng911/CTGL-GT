public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            // Biến kiểm tra để tối ưu hóa, dừng nếu mảng đã sắp xếp
            boolean swapped = false;
            // Vòng lặp so sánh từng cặp phần tử
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Đổi chỗ nếu phần tử hiện tại lớn hơn phần tử kế tiếp
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Nếu không có phần tử nào được đổi chỗ, thoát vòng lặp vì mảng đã sắp xếp
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    // Hàm in mảng
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
