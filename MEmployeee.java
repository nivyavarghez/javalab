import java.io.*;
import java.util.*;

class Employee{
		String name,address,phno;
		int age;
		double salary;
	public Employee(String name,int age,String phno,String address,double salary){
	this.name=name;
	this.age=age;
	this.phno=phno;
	this.address=address;
	this.salary=salary;
	}
	public void print_salary(){
		System.out.println("Salary: "+salary);
	}
}

class Officer extends Employee{
	String specializn;
	public Officer(String name,int age,String phno,String address,String specializn,double salary){
		super(name,age,phno,address,salary);//calling the name,age,etc...from Employee

		this.specializn=specializn;
	}
}

class Manager extends Employee{
	String dept;
	public Manager(String name,int age,String phno,String address,String dept,double salary){
		super(name,age,phno,address,salary);//calling the name,age,etc...from Employee

		this.dept=dept;
	}
}



public class MEmployeee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Officer
        System.out.println("Enter Officer details:");
        System.out.print("Name: ");
        String officerName = scanner.nextLine();
        System.out.print("Age: ");
        int officerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
        System.out.print("Phone Number: ");
        String officerPhno = scanner.nextLine();
        System.out.print("Address: ");
        String officerAddress = scanner.nextLine();
        System.out.print("Specialization: ");
        String officerSpecializn = scanner.nextLine();
        System.out.print("Salary: ");
        double officerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble()

        // Create Officer object
        Officer officer = new Officer(officerName, officerAge, officerPhno, officerAddress, officerSpecializn, officerSalary);

        // Get input for Manager
        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
        System.out.print("Phone Number: ");
        String managerPhno = scanner.nextLine();
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Department: ");
        String managerDept = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble()

        // Create Manager object
        Manager manager = new Manager(managerName, managerAge, managerPhno, managerAddress, managerDept, managerSalary);

        scanner.close();

        // Print details of the Officer
        System.out.println("\nOfficer Details:");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone Number: " + officer.phno);
        System.out.println("Address: " + officer.address);
        System.out.println("Specialization: " + officer.specializn);
        officer.print_salary();

        // Print details of the Manager
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phno);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.dept);
        manager.print_salary();
    }
}