package edu.monmouth.assignment1;

public class Dog implements Animal{

	protected String furColor;
	
	public Dog() {
	}
	
	public Dog(String furColor) {
		this.furColor = furColor;
	}
	
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public String getFurColor() {
		return furColor;
	}

	@Override
	public void move() {
		System.out.println("Dog is Running");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Bark!");
	}

	@Override
	public String toString() {
		return ("Dog [furColor] = " + getFurColor());
	}
	
}
