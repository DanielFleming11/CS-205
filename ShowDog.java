package edu.monmouth.assignment1;

public class ShowDog extends Dog{

	private String breed;
	
	public ShowDog() {
		super();
	}
	
	public ShowDog(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void move() {
		System.out.println("Show Dog is Trouting");
	}

	@Override
	public void makeSound() {
		System.out.println("Ruff!");
	}
	
	@Override
	public String toString() {
		return "Dog [furColor] = " + getFurColor() + " Dog [Breed] = " + getBreed();
	}
}
