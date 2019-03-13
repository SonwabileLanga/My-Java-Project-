public class Tiger extends Monster{

    Tiger(){
        super.setSpecies("ferocious tiger");
    }

    Tiger(String str){
        super(10, 200, 900);
        super.setSpecies("ferocious tiger");
    }

    public void attack(Player target){
        System.out.println(target.toString() + " is pounced upon by the " + this.toString());
        System.out.println(target.toString() + " loses " + this.getAttackStrength() + "HP");
        target.setHP(target.getHP()-this.getAttackStrength());
    }
}
