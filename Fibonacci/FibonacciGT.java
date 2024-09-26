public class FibonacciGT {
    public long Fib1(int n) {
        // Khoi tao mang F voi mang co N phan tu + 1
        long[] F = new long[n - 1];
        // Khoi tao 2 bien co dinh cho mang F
        F[0] = 0;
        F[1] = 1;
        // Sau khi khoi tao 2 bien co dinh cho i chay den n
        for (int i = 2; i <= n; i++) {
            // Day fibonnacci = F=F-1+F-2
            // Vòng lặp sẽ điền vào mảng bằng cách cộng hai số Fibonacci trước đó để tính ra
            // số tiếp theo.
            F[i] = F[i - 1] + F[i - 2];
            // F[2] = F[1] +F[0]
            // F[3] = F[2] + F[1]
        }
        return F[n];
    }

    public long Fib2(int n) {
        // Neu n = 0 tra ve 0
        // Neu n = 1 tra ve 1
        if (n <= 1) {
            return n;
        }
        // Vi du Fib(5)=Fib(4)-Fib(3)
        // Fib2(n-1) : Tinh so Fib n-1
        // Fib2(n-2) : Tinh so Fib n-2
        // Cong lai ta co de quy N
        return Fib2(n - 1) + Fib2(n - 2);
    }
}

// Fib1 sẽ tối ưu hóa thời gian vì không có tính lặp lại
// Fib2 sẽ liên tục lặp lại để tính số đệ quy trước N làm cho dễ bị tràn ngăn
// xếp.