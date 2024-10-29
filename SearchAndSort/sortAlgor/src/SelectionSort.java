public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Duyệt qua từng phần tử trong mảng
        for (int i = 0; i < n - 1; i++) {
            // Giả định phần tử đầu tiên là nhỏ nhất
            int minIndex = i;
            // Tìm phần tử nhỏ nhất trong mảng còn lại
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Đổi chỗ phần tử nhỏ nhất tìm được với phần tử đầu tiên
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr);

        selectionSort(arr);

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
/*
 * Giải thích thuật toán Selection Sort:
 * Mục đích: Sắp xếp các phần tử của mảng theo thứ tự tăng dần.
 * Cách hoạt động:
 * Bắt đầu từ phần tử đầu tiên (i = 0), tìm phần tử nhỏ nhất trong phần còn lại
 * của mảng.
 * Đổi chỗ phần tử nhỏ nhất đó với phần tử hiện tại (arr[i]).
 * Tiếp tục với phần tử tiếp theo (i = 1) và lặp lại quá trình cho đến cuối
 * mảng.
 * Biến minIndex:
 * minIndex lưu chỉ số của phần tử nhỏ nhất được tìm thấy trong vòng lặp.
 * Khi kết thúc vòng lặp nội (j), phần tử nhỏ nhất sẽ được đổi chỗ với phần tử ở
 * vị trí i.
 * Độ phức tạp:
 * Thời gian: O(n²), với n là số phần tử của mảng (vì phải duyệt qua tất cả các
 * phần tử hai lần).
 * Không gian: O(1), vì không cần dùng thêm mảng phụ
 */