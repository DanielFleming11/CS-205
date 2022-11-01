package edu.monmouth.employee;

public class SalesEmployee implements Employee{
	private int commission;
	private int yearlyBase;
	
	public SalesEmployee(int yearlyBase) {
		this.yearlyBase = yearlyBase;
	}
	
	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	
	
	public boolean equals(Employee object) {
		if(object.getMonthlyPay() == (yearlyBase/12)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int getMonthlyPay() {
		return (yearlyBase/12);
	}
	
	public String toString() {
		return  "" +
				"\nSales Employee " +
				"\nYearly Base = " + yearlyBase +
				"\nMonthly Pay = " + getMonthlyPay() +
				"\nCommission = " + commission; 
	}

}
