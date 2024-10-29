package leetcode;

class leetcode9 {
    public boolean isPalindrome(int x) {
        // So doi xung khong am va no khong co chu so 0 o dau (ngoai tru khong) ,thi
        // khong the la so doi xung

        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        // Chuyen ve chuoi
        String str = Integer.toString(x);
        // Dao nguoc chuoi neu chuoi dao nguoc = chuoi ban dau return true nguoc lai
        // false
        String revesedStr = new StringBuilder(str).reverse().toString();
        return str.equals(revesedStr);
    }

    public static void main(String[] args) {
        leetcode9 LC = new leetcode9();
        System.out.println(LC.isPalindrome(-121));
    }
}