package Dequy;

public class TinhTong {
    public int Tong(int n) {
        if (n == 0) {
            return n;

        }
        return n + Tong(n - 1);
    }
}
/*
 * Tinh tong hoat dong nhu sau
 * Khoi tao bien tong vao = n sau do moi lan goi se lay n + Tong(n-1) tuc la +
 * cho N tru di 1 don vi
 * Vd = 5
 * lan dau nhap 5 !=0 sau do return 5 + Tong(5-1) =>5+5-1=9
 * Lan 2 khi nay n-1 se bang 4 nen 9 +Tong(4-1)=12
 * 12+Tong(3-1)=14
 * 14+Tong(2-1)=15
 * sau do khi 1-1 = 0 no se tra ve n =0 va chung ta co 0 + 15 = 0
 */