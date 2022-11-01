package edu.monmouth.employee;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;

public class Lab1Lecture {
    private static final int RedirectFailure = -1;
    public static final String LOGFILENAME = "/Users/dannyfleming/eclipse-workspace/Lab1Lecture/src/edu/monmouth/employee/Lab1Lecture1-1.txt";
    
	public static void main(String[] args) {
	// direct standard out & err to Lab1Lecture.txt
    	
    	try {
			PrintStream newIO = new PrintStream(LOGFILENAME);
			System.setOut(newIO);
			System.setErr(newIO);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(RedirectFailure);
		}
	// declare a List that stores Employee objects in a LinkedList
	    LinkedList<Employee> employees = new LinkedList<>();
	    	
    	// construct a SalaryEmployee with a yearly salary of $30,000
    	SalaryEmployee salaryEmployee1 = new SalaryEmployee(30000);
    	
    	// construct a SalaryEmployee with a yearly salary of $35,000
    	SalaryEmployee salaryEmployee2 = new SalaryEmployee(35000);
    	
    	// construct a PieceEmployee that gets paid $60 per piece made
    	PieceEmployee pieceEmployee1 = new PieceEmployee(60);
    	// set the number of pieces made this month to 2,000
    	pieceEmployee1.setPiecesMade(2000);
    	
    	// construct a PieceEmployee that gets paid $40 per piece made
    	PieceEmployee pieceEmployee2 = new PieceEmployee(40);
    	// set the number of pieces made this month to 3,500
    	pieceEmployee2.setPiecesMade(3500);
    	
    	// construct a SalaryEmployee with a yearly salary of $100,000
    	SalaryEmployee salaryEmployee3 = new SalaryEmployee(100000);
    	
    	// construct a SalesEmployee with a yearly base of $60,000
    	SalesEmployee salesEmployee = new SalesEmployee(60000);
    	// set this month's commission to $30,000
    	salesEmployee.setCommission(30000);
    	
    	// add these Employees to the list
    	employees.add(salaryEmployee1);
    	employees.add(salaryEmployee2);
    	employees.add(pieceEmployee1);
    	employees.add(pieceEmployee2);
    	employees.add(salaryEmployee3);
    	employees.add(salesEmployee);
    	
	System.out.println("Iterating forward through list");
	
	// using an Iterator, iterate forward thru the list, printing each Employee's attributes
	Iterator it = employees.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next().toString());
	}
	
	System.out.println();
	System.out.println("Iterating forward here is each monthlyPay");
	// using an Iterator, iterate thru the list, printing each Employee's monthly pay
	Iterator it2 =employees.iterator();
	while(it2.hasNext()) {
		System.out.println(((Employee) it2.next()).getMonthlyPay());
	}
	
	// remove salaryEmployee1 from the list
		employees.remove(salaryEmployee1);
	
	System.out.println();
	System.out.println("Iterating forward after removal");
	// using an Iterator, iterate thru the list, printing each Employee's attributes
	Iterator it3 = employees.iterator();
	while(it3.hasNext()) {
		System.out.println(it3.next().toString());
	}
	// declare an array of references to Employee objects
	// sized to the number of Employee objects in the List
	// using a List method, transfer the List to the array
	Object [] employeesArray = employees.toArray();

	// iterate thru the array, printing out each Employee's attributes
	System.out.println();
	System.out.println("Contents of array");	
	
	for(int i = 0; i < employeesArray.length; i++) {
		System.out.println(employeesArray[i].toString());
	}
	
    }

}
