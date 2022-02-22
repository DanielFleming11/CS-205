package edu.monmouth.assignment1;

public class AnimalTester {

	public static int MAXANIMAL = 5;
	public static int i = 0;
	public static Animal animalInArray;
	
	public static void main(String[] args) {

//Create 5 animal objects 
		Dog dog = new Dog("Brown");
		Fish fish = new Fish("Blue");
		ShowDog showDog = new ShowDog("German Sheperd");
		GuardDog guardDog = new GuardDog((short) 10);
		Tetra tetra = new Tetra("Fast");
		
//Create and Initialize Array
		Animal[] animals = new Animal[MAXANIMAL];
		animals[0] = dog;
		animals[1] = fish;
		animals[2] = showDog;
		animals[3] = guardDog;
		animals[4] = tetra;
		
		for (Animal animalInArray : animals) {
			animalInArray.move();
		}
		
		i = 0;
		while(i < animals.length) {
			animals[i].makeSound();
			i ++;
		}
		
		i = 0;
		for(i = 0; i < animals.length; i ++) {
//TODO Wont work. Tried for the past week.
			animals[i].toString();
		}
	}
}
