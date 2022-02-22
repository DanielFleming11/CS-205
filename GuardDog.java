package edu.monmouth.assignment1;

public class GuardDog extends Dog{

	private short meanness;
	
	public GuardDog() {
		super();
	}
	
	public GuardDog(short meanness) {
		this.meanness = meanness;
	}
	
	public void setMeanness(short meanness) {
		this.meanness = meanness;
	}
	
	public short getMeanness() {
		return meanness;
	}
	
	@Override
	public void move() {
		System.out.println("Guard Dog is Running");
	}

	@Override
	public void makeSound() {
		System.out.println("Bark!");
	}
	
	@Override
	public String toString() {
		return "Dog [furColor] = " + getFurColor() + " Dog [Meanness] = " + getMeanness();
	}
}
