package edu.monmouth.employee;

public class SalaryEmployee implements Employee{
	private int yearlySalary;
	
	public SalaryEmployee(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	public boolean equals(Employee object) {
		if(object.getMonthlyPay() == (yearlySalary/12)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int getMonthlyPay() {
		return (yearlySalary/12);
	}

	@Override
	public String toString() {
		return  "" +
				"\nSalary Employee " +
				"\nYearly Salary = " + yearlySalary +
				"\nMonthly Pay = " + getMonthlyPay();
	}
	
	

}
