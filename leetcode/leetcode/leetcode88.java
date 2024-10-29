package leetcode;

public class leetcode88 {
    public static void Merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;// chi so n1
        int j = n - 1;// chi so n2
        int k = m + n - 1;// chi so cho vi tri dung trong n1
        // Hop nhat tu cuoi cua hai mang
        while (i >= 0 && j >= 0) {
            if (n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n2[i];
                j--;
            }
        }
        k--;
        // Neu mang n2 con phan tu thi them vao mang n1
        while (j >= 0) {
            n1[k] = n2[j];
            j--;
            k--;
        }
    }
}
