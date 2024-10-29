package leetcode;

public class leetcode1295 {
    public int Findnumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            // Kiem tra so chu so cua a
            // Neu chu so cua a chan tang dem len +1
            int Number = NumberofDigit(a);
            if (Number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int NumberofDigit(int a) {
        int count = 0;
        int kq = a;

        while (kq != 0) {
            kq = a / 10;
            a = kq;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode1295 Sl = new leetcode1295();

        int[] nums = { 12, 345, 2, 6, 7896 };
        int result = Sl.Findnumbers(nums);
        System.out.println(result);
    }
}
