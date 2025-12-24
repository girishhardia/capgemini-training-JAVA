import java.util.Scanner;
class ClockProblem {

    public static int clockProblem(int input1, int input2) {

        int movement = input1 * input2;

        int finalPosition = movement % 12;

        if (finalPosition == 0) {
            return 12;
        }

        return finalPosition;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        System.out.println(clockProblem(3, 4));   // Output: 12
        System.out.println(clockProblem(5, 3));   // Output: 3
        System.out.println(clockProblem(12, 2));  // Output: 12
        System.out.println(clockProblem(7, 5));   // Output: 11
    }
}
