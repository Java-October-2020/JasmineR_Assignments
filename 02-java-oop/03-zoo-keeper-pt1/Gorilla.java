public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		this.energyLevel -= 5;
		this.displayEnegry();
		System.out.println("throwing something");
	}
	public void eatBanana() {
		this.energyLevel += 10;
		this.displayEnegry();
		System.out.println("eating some bananas");
	}
	public void climb() {
		this.energyLevel -= 10;
		this.displayEnegry();
		System.out.println("climbing");
	}
}