public class Knight extends Player{

    Knight(String name){
        super("Sir " + name, 150, 100, 150);
        super.setPlayerClass("Knight");
        System.out.println("You are " + name + "! A gallant " + super.getPlayerClass() + "!");
    }

    public void attack(Monster target){
        System.out.println(this.toString() + " swings his sword at the " + target.toString());
        System.out.println(target.toString() + " loses " + this.getAttackStrength() + " HP" );
        target.setHP(target.getHP()-this.getAttackStrength());
    }
}
