import java.io.*;

class Person {
    String name;
    int age;

    public void readDetails() {
        DataInputStream din = new DataInputStream(System.in);

        System.out.println("Enter name:");
        name = din.readLine();

        System.out.println("Enter age:");
        age = scanner.nextInt();
        din.readLine();  
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
        DataInputStream din = new DataInputStream(System.in);

        System.out.println("Enter student ID:");
        studentId = din.readLine();
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
	DataInputStream din = new DataInputStream(System.in);
        System.out.println("Enter employee ID:");
        employeeId = din.readLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Main {
    public static void main(String[] args) {
        DataInputStream din = new DataInputStream(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Enter Teacher Details");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = din.ParseInt();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.readDetails();
                    break;
                case 2:
                    Student studentDisplay = new Student();
                    studentDisplay.displayDetails();
                    break;
                case 3:
                    Teacher teacher = new Teacher();
                    teacher.readDetails();
                    break;
                case 4:
                    Teacher teacherDisplay = new Teacher();
                    teacherDisplay.displayDetails();
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
