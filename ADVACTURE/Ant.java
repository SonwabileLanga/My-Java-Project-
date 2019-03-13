public class Ant extends Monster{

    Ant(){
        super.setSpecies("giant ant");
    }

    Ant(String str){
        super(1, 1, 1);
        super.setSpecies("giant ant");
    }

    public void attack(Player target){
        System.out.println(target.toString() + " is bitten by the " + this.toString());
        System.out.println(target.toString() + " loses " + this.getAttackStrength() + "HP");
        target.setHP(target.getHP()-this.getAttackStrength());
    }
}
