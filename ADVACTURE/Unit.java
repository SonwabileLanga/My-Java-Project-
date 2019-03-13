abstract class Unit{

    private int hp;
    private int attackStrength;
    private int defence;

    Unit(int hp, int attackStrength, int defence){
        this.hp = hp;
        this.attackStrength = attackStrength;
        this.defence = defence;
    }

    public int getHP(){
        return hp;
    }

    public void setHP(int newHP){
        hp = newHP;
    }

    public int getAttackStrength(){
        return attackStrength;
    }

    public void setAttackStrength(int newAttackStrength){
        attackStrength = newAttackStrength;
    }

    public int getDefence(){
        return defence;
    }

    public void setDefence(int newDefence){
        defence = newDefence;
    }
}
