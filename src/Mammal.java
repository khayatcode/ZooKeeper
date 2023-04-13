
public class Mammal {
	protected int energy;
	
	public Mammal() {
		this.energy = 100;
	}
	
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	public int displayEnergyLevel() {
		System.out.println("\n---Display Energy Level---");
		System.out.println("Energy Level: " + this.energy);
		return this.energy;
	}
	
	public void increaseEnergyLevel(int number) {
		this.energy += number;
		System.out.println("Energy Level: " + this.energy);
	}
	
	public void decreaseEnergyLevel(int number) {
		this.energy -= number;
		System.out.println("Energy Level: " + this.energy);
	}

}
