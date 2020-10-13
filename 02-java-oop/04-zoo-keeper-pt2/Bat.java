public class Bat extends Mammal {
    public Bat(int energyLevel) {
		super energyLevel = 300;
	}
	public void fly() {
		System.out.println("Bat woosh woosh");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("eating some Humans");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("The Bat is Attacking the Town");
		energyLevel -= 100;
	}
}