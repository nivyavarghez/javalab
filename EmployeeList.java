import java.util.*;

class EmployeeList{
		
		String Name;
		int Age;
		Bool PhoneNu;
		String Address;
		double Salary;
		
		public Employee(String Name , double salary){
			this .name = name;
			this.salary = salary;
		}
		public void printSalary(Int Salary){
			System.out.println("Salary For "+ name +" : "+salary);
		}
		public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter Employee nm:");
			String name = scanner . nextLine();
			
			System.out.println("Enter Salary:");
			double salary = scanner . nextDouble();

			Employee employee = new Employee(name, salary);

			employee.printSalary();

		}
}