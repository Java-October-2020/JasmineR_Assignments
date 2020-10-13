public class Mammals {
    int energyLevel = 300;

	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}