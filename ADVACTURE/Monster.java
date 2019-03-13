public class Monster extends Unit implements MonsterBehaviour{

    private String species = "monster";

    Monster(){
        super(1000, 1000, 1000);
    }

    Monster(int hp, int attackStrength, int defence){
        super(hp, attackStrength, defence);
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public void attack(Player target){
        System.out.println(target.toString() + " is attacked by the " + this.toString());
    }

    @Override
    public String toString(){
        return species;
    }
}
