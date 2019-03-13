public class Wizard extends Player{

    Wizard(String name){
        super(name + " the Mighty", 50, 100, 50);
        super.setPlayerClass("Wizard");
        System.out.println("You are " + name + "! A powerful " + super.getPlayerClass() + "!");
    }

    public void attack(Monster target){
        System.out.println(this.toString() + " throws a fireball at the " + target.toString());
        System.out.println(target.toString() + " loses " + this.getAttackStrength() + " HP" );
        target.setHP(target.getHP()-this.getAttackStrength());
    }
}
