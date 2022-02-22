package edu.monmouth.assignment1;


public class BetaFish extends Fish{

	private String finSize;
	
	public BetaFish() {
		super();
	}
	
	public BetaFish(String finSize) {
		this.finSize = finSize;
	}

	 public void setFinSize() {
		 this.finSize = finSize;
	 }

	 public String getFinSize() {
		 return finSize;
	 }
	 
	 @Override
	public void move() {
		 System.out.println("Betta Fish is Floating");
	}
	 
	@Override
	public void makeSound() {
		System.out.println("Glub!");
			
	}
		
	@Override
	public String toString() {
		 return ("BetaFish [Fin Size] = " + getFinSize());
	 }
	
}
