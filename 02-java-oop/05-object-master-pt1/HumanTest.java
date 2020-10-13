public class HumanTest{
    public static void main (String[] args){
        Human Bob = new Human();
        Human Billy = new Human();

        Bob.attack(Billy);
        System.out.print(Billy.health);
    }
}