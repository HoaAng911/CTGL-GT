package Dequy;

public class ThapHaNoi {
    /* Ham de quy thuc hien bai toan thap ha noi */
    public void THN(int n, String cot_nguon, String cot_trung_gian, String cot_dich) {
        if (n == 1) {
            System.out.println("Di chuyen coc " + cot_nguon + " sang coc " + cot_dich);
        } else {
            // Di chuyen n-1 dia tu coc nguon sang coc trung gian ;
            THN(n - 1, cot_nguon, cot_dich, cot_trung_gian);
            // Di chuyen dia lon nhat tu coc nguon sang coc dich
            System.out.println("Di chuyen dia " + n + " tu coc " + cot_nguon + " sang coc " + cot_dich);
            // Di chuyen n-1 dia tu coc trung gian sang coc dich
            THN(n - 1, cot_trung_gian, cot_nguon, cot_dich);
        }

    }

    public static void main(String[] args) {
        ThapHaNoi THN = new ThapHaNoi();
        int n = 3;
        THN.THN(n, "A", "B", "C");
    }
}