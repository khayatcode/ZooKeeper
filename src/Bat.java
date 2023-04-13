
public class Bat extends Mammal {
	
	public Bat() {
		super(300);
		this.displayEnergyLevel();
	}
	
	public void fly() {
		System.out.println("\nThe Bat is flying");
		int energy = 50;
		super.decreaseEnergyLevel(energy);
		
	}
	
	public void eatHumans() {
		System.out.println("\nThe Bat is eating humans");	
		int energy = 25;
		super.increaseEnergyLevel(energy);
		}
	
	public void attackTown() {
		System.out.println("\nThe Bat is attacking the town");
		int energy = 100;
		super.decreaseEnergyLevel(energy);
	}
	

}
