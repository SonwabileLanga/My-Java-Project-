public class Weapon extends Item{
    public Weapon(){
        super("attack", 1000);
        super.setName("Dragonsbane");
    }

    @Override
    public String toString(){
        return getName();
    }
}
