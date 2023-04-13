
public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
		this.displayEnergyLevel();
	}
	
	public void throwSomething() {
		System.out.println("\nThe Gorilla has thrown on object");
		int energy = 5;
		super.decreaseEnergyLevel(energy);	
	}
	
	public void eatBanana() {
		System.out.println("\nYum Yum Banana");
		int energy = 10;
		super.increaseEnergyLevel(energy);
	}
	
	public void climb() {
		System.out.println("\nThe Gorilla has climbed a tree");
		int energy = 10;
		super.decreaseEnergyLevel(energy);
	}
}
