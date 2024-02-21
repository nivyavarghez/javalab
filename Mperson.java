import java.io.*;

class Person {
    String name;
    int age;

    public void readDetails() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter name:");
            name = br.readLine();

            System.out.println("Enter age:");
            age = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    @Override
    public void readDetails() {
        super.readDetails();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter student ID:");
            studentId = br.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher extends Person {
    String employeeId;

    @Override
    public void readDetails() {
        super.readDetails();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter employee ID:");
            employeeId = br.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Mperson {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Management Program!");
        System.out.println("Please enter your name before proceeding.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String yourName = br.readLine();
            System.out.println("Hello, " + yourName + "! Let's proceed with the program.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        int choice;

        // Create single objects for Student and Teacher to reuse for entering and displaying details
        Student student = new Student();
        Teacher teacher = new Teacher();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Enter Teacher Details");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(br.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                choice = 0;
            }

            switch (choice) {
                case 1:
                    student.readDetails();
                    break;
                case 2:
                    student.displayDetails();
                    break;
                case 3:
                    teacher.readDetails();
                    break;
                case 4:
                    teacher.displayDetails();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }
}
