
public class TestMammal {

	public static void main(String[] args) {
				
		Gorilla gorillaAnimal = new Gorilla();
		
		// Throw
		gorillaAnimal.throwSomething();
		gorillaAnimal.throwSomething();
		gorillaAnimal.throwSomething();
		
		// Eat
		gorillaAnimal.eatBanana();
		gorillaAnimal.eatBanana();
		
		// Climb
		
		gorillaAnimal.climb();
		gorillaAnimal.climb();
		
		Bat batAnimal = new Bat();
		
		// Attack
		batAnimal.attackTown();
		batAnimal.attackTown();
	
		
		// Eat
		batAnimal.eatHumans();
		batAnimal.eatHumans();
		
		// Fly
		
		batAnimal.fly();
		batAnimal.fly();
		
		// Display Energy Level
		batAnimal.displayEnergyLevel();

	}

}
