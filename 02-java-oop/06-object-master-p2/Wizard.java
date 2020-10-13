public class Wizard extends Human2 {
    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
        numwizard = ();
    }

    public void heal(Human target) {
        target.health += this.intelligence;
    }

    public void fireball(Human target) {
        target.health -= (this.intelligence * 3);
    }

    
}