public class Human{
   int strength = 3;
   int stealth = 3;
   int intelligence = 3;
   int health = 100;

        public Human(int strength, int stealth, int intelligence, int health){
            this.strength = strength;
            this.stealth = stealth;
            this.intelligence = intelligence;
            this.health = health;
        }
        public void attack(humans){
        target.health -= this.strength;// the strengh of the human will decrease as well as the strenght. 
    }
}