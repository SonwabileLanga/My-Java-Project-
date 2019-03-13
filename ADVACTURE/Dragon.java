public class Dragon extends Monster{

    Dragon(){
        super.setSpecies("fire breathing dragon");
    }

    public void attack(Player target){
        System.out.println(target.toString() + " is engulfed in a torrent of flame issued forth from the " + this.toString());
        if(target.getDefence() < 1000){
            System.out.println(target.toString() + " loses " + this.getAttackStrength() + "HP");
            target.setHP(target.getHP()-this.getAttackStrength());
        }
    }
}
