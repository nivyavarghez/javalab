import java.util.*;

class Employee {
    int eno;
    String ename;
    double esal;

       public void readDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Number:");
        eno = scanner.nextInt();

        System.out.println("Enter Employee Name:");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        ename = scanner.nextLine();

        System.out.println("Enter Employee Salary:");
        esal = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esal);
    }

    // Function to search for an employee by eno
    public boolean searchEmployee(int searchEno) {
        return eno == searchEno;
    }
}

public class Memployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].readDetails();
        }

        // Display all employees
        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("-------------------------");
        }

        // Search for an employee by eno
        System.out.println("\nEnter the Employee Number to search:");
        int searchEno = scanner.nextInt();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.searchEmployee(searchEno)) {
                System.out.println("\nEmployee Found:");
                employee.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee with Employee Number " + searchEno + " not found.");
        }
    }
}
