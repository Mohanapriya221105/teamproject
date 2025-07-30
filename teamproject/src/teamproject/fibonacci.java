package teamproject;

import java.util.Scanner;

public class fibonacci {

    int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        fibonacci obj = new fibonacci();
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println("Fibonacci("+n+"): " + obj.fib(n));  // Output: 8
    }
}
