import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FibonacciGT fib1 = new FibonacciGT();
        FibonacciGT fib2 = new FibonacciGT();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        long t0 = System.nanoTime();
        System.out.println("Lap: phan tu thu " + n + " la " + fib1.Fib1(n));
        long t1 = System.nanoTime();
        System.out.println("Thoi gian chay cua tt lap la:" + (t1 - t0));
        System.out.println("De quy: phan tu thu " + n + " la " + fib2.Fib2(n));
        long t2 = System.nanoTime();
        System.out.println("Thoi gian chay cua tt De quy la: " + (t2 - t1));
        input.close();
    }
}
