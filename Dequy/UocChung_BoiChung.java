package Dequy;

public class UocChung_BoiChung {
    public int UCLon_nhat(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLon_nhat(b, a % b);
        }
    }

    public int BCNho_nhat(int a, int b) {
        return (a * b) / UCLon_nhat(a, b);
    }
}
