public class Item{
    private String modifierType;
    private int modifierAmount;
    private boolean consumable;
    private String name = "junk";

    public Item(String modifierType, int modifierAmount){
        this.modifierType = modifierType;
        this.modifierAmount = modifierAmount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModifierType(){
        return modifierType;
    }

    public void setModifierType(String modifierType){
        this.modifierType = modifierType;
    }

    public int getModifierAmount(){
        return modifierAmount;
    }

    public void setModifierAmount(int modifierAmount){
        this.modifierAmount = modifierAmount;
    }

    public void setConsumable(boolean value){
        consumable = value;
    }
}
