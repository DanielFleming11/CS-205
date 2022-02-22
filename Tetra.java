package edu.monmouth.assignment1;

public class Tetra extends Fish {

	private String speed;
	
	public Tetra() {
		super();
	}
	
	public Tetra(String speed) {
		this.speed = speed;
	}
	
	 public void setSpeed() {
		 this.speed = speed;
	 }

	 public String getSpeed() {
		 return speed;
	 }
	 
	 @Override
	 public void move() {
		 System.out.println("Tetra is Jetting");
		}

	@Override
	public void makeSound() {
		System.out.println("Blurp!");
		}
		
	@Override 
		public String toString() {
			 return ("Betta Fish [Speed] = " + getSpeed());
		 }
}
