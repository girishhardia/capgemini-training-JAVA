import java.util.Scanner;

class FibonacciSeries {

    // Method to check perfect square
    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }

    // Method to check Fibonacci number
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) ||
               isPerfectSquare(5 * n * n - 4);
    }

    // MAIN METHOD (ENTRY POINT)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isFibonacci(num)) {
            System.out.println(num + " is a Fibonacci number");
        } else {
            System.out.println(num + " is NOT a Fibonacci number");
        }

        sc.close();
    }
}

