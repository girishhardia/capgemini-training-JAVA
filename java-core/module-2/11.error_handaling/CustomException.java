import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        System.out.println(message);
    }
}

public class CustomException {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not eligible for voting.");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input provided.");
        } finally {
            scanner.close();
        }
    }
}
