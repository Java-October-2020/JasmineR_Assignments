public class Human2{
    protected int health = 100;
    protected int strenght = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected String name; 
    protected static int numSamurai =0;
    protected static int numninja = 0;
    protected static int numwizard = 0;
    
    public Human2(int health, int strength, int stealth, int intelligence){
        this.health = health;
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
    }
    public void attack(Human target){
    target.health -= this.strength;
}
// worked on this with nathalie. 