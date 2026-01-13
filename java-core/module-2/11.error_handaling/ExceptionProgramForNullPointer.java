import java.util.Scanner;

public class ExceptionProgramForNullPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (type 'null' to trigger exception): ");
        String input = scanner.nextLine();

        String str = input.equalsIgnoreCase("null") ? null : input;

        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot invoke length() because 'str' is null.");
        } finally {
            scanner.close();
        }
    }
}
