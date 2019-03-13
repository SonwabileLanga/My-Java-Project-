import java.util.ArrayList;
public class Player extends Unit implements PlayerBehaviour{

    private String name;
    private String playerClass = "dirty peasant";
    private int location = 0;
    private ArrayList <Item> inventory = new ArrayList<Item>(2);

    Player(String name){
        super(1, 1, 1);
        this.name = name;
        System.out.println("You are " + name + ", a " + playerClass);
    }

    Player(String name, int hp, int attackStrength, int defence){
        super(hp, attackStrength, defence);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getPlayerClass(){
        return playerClass;
    }

    public void setPlayerClass(String newPlayerClass){
        playerClass = newPlayerClass;
    }

    public int getLocation(){
        return location;
    }

    public void setLocation(int newLocation){
        location = newLocation;
    }

    public void move(){
        int currentLocation = getLocation();
        int newLocation = currentLocation + 1;
        setLocation(newLocation);
    }

    public void attack(Monster target){
        System.out.println(this.toString() + " attacks the " + target.toString());
    }

    public void pickUp(Item item){
        inventory.add(item);
        if(item.getModifierType().equals("attack")){
            setAttackStrength(getAttackStrength() + item.getModifierAmount());
            System.out.println("Player attack strength increased by: " + item.getModifierAmount());
        }
    }

    public Item checkInventory(int idx){
        return inventory.get(idx);
    }

    @Override
    public String toString(){
        return name + ", the " + playerClass + ",";
    }
}
