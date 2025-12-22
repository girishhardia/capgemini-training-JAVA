import java.util.Scanner;

class EmployeeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID - ");
        int empID = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter name - ");
        String name = sc.nextLine();

        System.out.print("Enter age - ");
        int age = sc.nextInt();

        if (age < 21) {
            System.out.println("Employee not eligible to work.");
            return;
        }

        System.out.print("Select a department (IT, HR, Finance): ");
        String deparChoice = sc.next();

        String role = "";
        double basicSalary = 0;
        double finalSalary = 0;
        String accessLevel = "";

        switch (deparChoice) {

            case "IT": {
                System.out.print("Choose role (Developer / Tester): ");
                role = sc.next();

                if (role.equals("Developer")) {
                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();
                    finalSalary = basicSalary + (basicSalary * 0.30);
                } 
                else if (role.equals("Tester")) {
                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();
                    finalSalary = basicSalary + (basicSalary * 0.25);
                } 
                else {
                    System.out.println("Invalid role");
                    return;
                }

                accessLevel = (finalSalary >= 60000) ? "Admin Access" : "Employee Access";
                break;
            }

            case "HR": {
                System.out.print("Choose role (Recruiter / Payroll): ");
                role = sc.next();

                if (role.equals("Recruiter")) {
                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();
                    finalSalary = basicSalary + (basicSalary * 0.20);
                } 
                else if (role.equals("Payroll")) {
                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();
                    finalSalary = basicSalary + (basicSalary * 0.22);
                } 
                else {
                    System.out.println("Invalid role");
                    return;
                }

                accessLevel = (finalSalary >= 60000) ? "Manager Access" : "Employee Access";
                break;
            }

            case "Finance": {
                System.out.print("Choose role (Accountant / Auditor): ");
                role = sc.next();

                if (role.equals("Accountant")) {
                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();
                    finalSalary = basicSalary + (basicSalary * 0.28);
                } 
                else if (role.equals("Auditor")) {
                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();
                    finalSalary = basicSalary + (basicSalary * 0.26);
                } 
                else {
                    System.out.println("Invalid role");
                    return;
                }

                accessLevel = (finalSalary >= 60000) ? "Manager Access" : "Employee Access";
                break;
            }

            default:
                System.out.println("Invalid department");
                return;
        }

        // FINAL OUTPUT (Single println as requested earlier)
        System.out.println(
            "empID = " + empID + ";\n" +
            "age = " + age + ";\n" +
            "name = \"" + name + "\";\n" +
            "deparChoice = \"" + deparChoice + "\";\n" +
            "role = \"" + role + "\";\n" +
            "basicSalary = " + basicSalary + ";\n" +
            "finalSalary = " + finalSalary + ";\n" +
            "accessLevel = \"" + accessLevel + "\";"
        );

        sc.close();
    }
}
