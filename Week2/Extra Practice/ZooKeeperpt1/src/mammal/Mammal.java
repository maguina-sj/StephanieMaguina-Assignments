package mammal;

public class Mammal {
	protected int energyLevel;

	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Your animal's energy level is " + this.energyLevel);
		return (this.energyLevel);
	}
}
