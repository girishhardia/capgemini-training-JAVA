import java.util.Scanner;

class DayType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day (all lowercase) - ");
        String day = sc.nextLine();

        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("Weekend");
        }
        else if (day.equals("monday") || day.equals("tuesday") ||
                 day.equals("wednesday") || day.equals("thursday") ||
                 day.equals("friday")) {
            System.out.println("Weekday");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}

