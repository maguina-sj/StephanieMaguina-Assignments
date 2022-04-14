package mammal;

public class Gorilla extends Mammal {

	
	public Gorilla(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public void throwSomething() {
		System.out.println("I threw stuff!");
		this.energyLevel -=5;
		this.displayEnergy();
		
	}
	public void eatBananas() {
		System.out.println("I ate a banana, yum");
		this.energyLevel += 10;
		this.displayEnergy();
	}
	public void climb() {
		System.out.println("climbing a tree now!");
		this.energyLevel -= 10;
		this.displayEnergy();	}
}
