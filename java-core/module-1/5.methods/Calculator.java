import java.util.Scanner;

public class Calculator {

    static int addThree(int a, int b, int c) {
        return a + b + c;
    }

    static int multiplyThree(int a, int b, int c) {
        return a * b * c;
    }

    static int subtractFour(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    static int addTwo(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers to add:");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Addition of 3 numbers = " + addThree(a1, b1, c1));

        System.out.println("\nEnter 3 numbers to multiply:");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Multiplication of 3 numbers = " + multiplyThree(a2, b2, c2));

        System.out.println("\nEnter 4 numbers to subtract:");
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        int d3 = sc.nextInt();
        System.out.println("Subtraction of 4 numbers = " + subtractFour(a3, b3, c3, d3));

        System.out.println("\nEnter 2 numbers to add:");
        int a4 = sc.nextInt();
        int b4 = sc.nextInt();
        System.out.println("Addition of 2 numbers = " + addTwo(a4, b4));

        
    }
}
