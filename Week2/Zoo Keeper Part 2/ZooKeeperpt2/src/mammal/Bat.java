package mammal;

public class Bat extends Mammal {

	public Bat() {
		super(300);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("bat took off, look out!");
		this.energyLevel -= 50;
		this.displayEnergy();
	}
	public void eatHumans() {
		System.out.println("--burp--");
		this.energyLevel += 25;
		this.displayEnergy();
		}
	public void attackTown() {
		System.out.println("The fire is shooting at us!");
		this.energyLevel -= 100;
		this.displayEnergy();	
		}
	
}
