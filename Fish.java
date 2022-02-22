package edu.monmouth.assignment1;

public class Fish implements Animal{

	protected String color;
	
	public Fish() {
	}
	
	public Fish(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void makeSound() {
		System.out.println("Blurp!");
	}
	
	@Override
	public void move() {
		System.out.println("Fish is Swimming");
	}
	
	@Override
	public String toString() {
		return "Dog [furColor] = " + getColor();
	}
}
