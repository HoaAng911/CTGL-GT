public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Duyệt qua từng phần tử từ vị trí thứ 2 (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i];// Lấy phần tử hiện tại làm "key"
            int j = i - 1;
            // Di chuyển các phần tử lớn hơn "key" sang phải
            while (j >= 0 && arr[i] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            // Đặt "key" vào đúng vị trí
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr);

        insertionSort(arr);

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
 * Giải thích thuật toán Insertion Sort:
 * Mục đích: Sắp xếp các phần tử của mảng theo thứ tự tăng dần.
 * Cách hoạt động:
 * Bắt đầu từ phần tử thứ 2 (index 1) và gọi nó là key.
 * So sánh key với các phần tử trước nó (từ phải sang trái).
 * Di chuyển các phần tử lớn hơn key sang bên phải để tạo chỗ trống.
 * Đặt key vào vị trí thích hợp.
 * Lặp lại quá trình cho đến khi duyệt hết mảng.
 * Minh họa:
 * Giả sử có mảng arr = {64, 25, 12, 22, 11}.
 * Bước 1: key = 25, so sánh với 64, chuyển 64 sang phải, và chèn 25 vào vị trí
 * đầu tiên.
 * Bước 2: key = 12, tiếp tục so sánh và dịch chuyển, cuối cùng chèn 12 vào vị
 * trí thích hợp.
 * Cứ tiếp tục như vậy cho đến khi mảng được sắp xếp.
 * Độ phức tạp:
 * Thời gian: O(n²), với n là số phần tử của mảng (vì phải duyệt qua tất cả các
 * phần tử hai lần trong trường hợp xấu nhất).
 * Không gian: O(1), vì không cần dùng thêm mảng phụ.
 */