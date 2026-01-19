// Q. WAJP to manage employee salary details using map.
// 	1. add atleast 6 employee records 
// 	2. print only those employees whose salary  is greater than 50000


public class Prac1 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> employees = new java.util.HashMap<>();

        // 1. add atleast 6 employee records
        employees.put("John Doe", 45000);
        employees.put("Jane Smith", 55000);
        employees.put("Alice Johnson", 62000);
        employees.put("Bob Brown", 48000);
        employees.put("Charlie Davis", 75000);
        employees.put("Eve Wilson", 51000);

        // 2. print only those employees whose salary is greater than 50000
        System.out.println("Employees with salary > 50000:");
        for (java.util.Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue() > 50000) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    
}
