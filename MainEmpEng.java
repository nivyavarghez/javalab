import java.io.*;
import java.util.*;

class Employee{
	public void disp(){
		System.out.println("Name of class is employee");
	}
	public void calcSalary(){
		System.out.println("Salary of employee is 10000");
	}
}

class Engineer extends Employee{
	public void calcSalary(){
		System.out.println("Salary of Manager is 20000");
	}
}

public class MainEmpEng{
	public static void main(String args[]){
		Engineer engineer = new Engineer();
		engineer.calcSalary();
		engineer.disp();
	}
}
