public class Rogue extends Player{

    Rogue(String name){
        super("Sly " + name, 80, 120, 80);
        super.setPlayerClass("Rogue");
        System.out.println("You are " + name + "! A cunning " + super.getPlayerClass() + "!");
    }

    public void attack(Monster target){
        System.out.println(this.toString() + " fires an arrow at the " + target.toString());
        System.out.println(target.toString() + " loses " + this.getAttackStrength() + " HP" );
        target.setHP(target.getHP()-this.getAttackStrength());
    }
}
