public class Potion extends Item{
    private boolean consumed = false;
    public Potion(){
        super("defence", 10000);
        super.setConsumable(true);
        super.setName("potion of fire resistance");
    }

    public int consume(){
        if(!consumed){
            consumed = true;
            System.out.println("*gulp gulp gulp*");
            return getModifierAmount();
        }else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return getName();
    }
}
