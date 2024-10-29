package Dequy;

public class Main {
    public static void main(String[] args) {
        TinhTong TT = new TinhTong();
        System.err.println("Tong hai so a va b la: " + TT.Tong(5));
        TinhSoMu SM = new TinhSoMu();
        System.out.println("Tinh so mu: " + SM.SoMu(2, 4));
        UocChung_BoiChung UCBC = new UocChung_BoiChung();
        System.out.println("Uoc chung lon nhat la: " + UCBC.UCLon_nhat(20, 10));
        System.out.println("Boi chung lon nhat la: " + UCBC.BCNho_nhat(20, 10));
    }
}
