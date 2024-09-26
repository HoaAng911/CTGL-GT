package Dequy;

public class TinhSoMu {
    public int SoMu(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * SoMu(a, b - 1);
    }

}
/*
 * a^b = a*a^b-1 neu b>0
 * a^0=1
 * VD co so a = 2 so mu =3
 * Lan Lap dau ta co co so a =2 co so b =3 thi ta co 2*SM(2,3) nhung ko co ket
 * qua nen goi ham 2*SM(2,3-1) nhung chua biet
 * ket qua
 * Lap lan 2 => 2*SM(2,2 ) chx biet ket qua nen goi ham 2*SM(2,2-1)
 * Lan lap 3 => 2*SM(2,1) luc nay khi b = 0 ta se tra ve dc la 1
 * quay tro trai Lan lap 3 ta co 2*1=2
 * quay tro lai lan lap 2 ta se co 2*2 tuc la 2*2 = 4
 * quay tro lai lan lap 1 ta se co 2*3 tuc la 2*3 = 8
 */
