public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }

    static void printFibonacci(int n) {
        if (n <= 0) return;

        long a = 1, b = 2;
        System.out.print(a);
        if (n == 1) {
            System.out.println();
            return;
        }
        System.out.print(", " + b);
        for (int i = 3; i <= n; i++) {
            long c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}